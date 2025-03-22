package org.musaibshabir.portfolio.components.sections.about

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.modifiers.columnGap
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.coroutines.delay
import org.jetbrains.compose.web.css.px
import org.musaibshabir.portfolio.components.AboutDiscriptionStyle
import org.musaibshabir.portfolio.components.models.Skill
import org.musaibshabir.portfolio.components.sections.about.style.AboutStyle
import org.musaibshabir.portfolio.components.sections.skills.SkillItem
import org.musaibshabir.portfolio.components.sections.skills.style.SkillsSectionStyle
import org.musaibshabir.portfolio.components.utils.Res
import org.musaibshabir.portfolio.components.widgets.SectionTitle
import kotlin.math.min

@Composable
fun About() {
    Column (
        modifier = AboutStyle.toModifier(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        SectionTitle(Res.Constants.ABOUT_ME_TITLE)


        //TypingEffectText(fullText = Res.Constants.ABOUT_ME_TEXT)

        SpanText(
            text = Res.Constants.ABOUT_ME_TEXT,
            modifier = AboutDiscriptionStyle.toModifier()
                .textAlign(TextAlign.Center)
                .lineHeight(2)

        )

        SimpleGrid(
            modifier = SkillsSectionStyle.toModifier().columnGap(60.px)
            ,
            numColumns = numColumns(base = 2, md = 5, lg = 5)
        ) {
            Skill.entries.forEach { skill ->
                SkillItem(
                    skill = skill,
                )
            }
        }



    }

}

@Composable
fun TypingEffectText(fullText: String, typingSpeed: Long = 3L) {
    var displayedText by remember { mutableStateOf("") }
    var alpha by remember { mutableStateOf(0f) }

    LaunchedEffect(fullText) {
        displayedText = ""
        alpha = 0f
        delay(300L)

        for (i in fullText.indices) {
            displayedText = fullText.substring(0, i + 1)
            alpha = min(1f, alpha + 0.05f)
            delay(typingSpeed)
        }
    }

    SpanText(
        text = displayedText,
        modifier = AboutDiscriptionStyle.toModifier()
            .textAlign(TextAlign.Justify)
            .lineHeight(2)
            .opacity(alpha)
    )
}

