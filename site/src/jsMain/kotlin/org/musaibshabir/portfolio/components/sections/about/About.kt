package org.musaibshabir.portfolio.components.sections.about

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.coroutines.delay
import org.musaibshabir.portfolio.components.SectionDescriptionStyle
import org.musaibshabir.portfolio.components.utils.Res
import org.musaibshabir.portfolio.components.widgets.SectionTitle
import org.musaibshabir.portfolio.components.sections.about.style.AboutStyle

@Composable
fun About() {
    Column(
        modifier = AboutStyle.toModifier(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Res.Constants.ABOUT_ME_TITLE)

        TypingEffectText(fullText = Res.Constants.ABOUT_ME_TEXT)
    }
}

@Composable
fun TypingEffectText(fullText: String, typingSpeed: Long = 40L) {
    var displayedText by remember { mutableStateOf("") }

    LaunchedEffect(fullText) {
        displayedText = ""
        for (i in fullText.indices) {
            displayedText = fullText.substring(0, i + 1)
            delay(typingSpeed)
        }
    }

    SpanText(
        text = displayedText,
        modifier = SectionDescriptionStyle.toModifier()
            .textAlign(TextAlign.Center)
            .color(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Colors.Gray
                    ColorMode.DARK -> Colors.Gray
                }
            )
            .fontFamily("Lexend")
    )
}