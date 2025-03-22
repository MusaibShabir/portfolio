package org.musaibshabir.portfolio.components.sections.skills

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.columnGap
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.graphics.ImageStyle
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.addVariant
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.musaibshabir.portfolio.components.ExperienceStyle
import org.musaibshabir.portfolio.components.models.Skill
import org.musaibshabir.portfolio.components.sections.skills.style.SkillsSectionStyle
import org.musaibshabir.portfolio.components.styles.SectionContainerStyle
import org.musaibshabir.portfolio.components.utils.Res
import org.musaibshabir.portfolio.components.widgets.SectionTitle
import org.musaibshabir.portfolio.theme.font.SkillProficiencyTextStyle
import org.musaibshabir.portfolio.theme.font.SkillTextStyle

@Composable
fun Skills() {
    Column(
        modifier = SectionContainerStyle.toModifier().id("skills_and_tools"),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Res.Constants.SKILLS_AND_TOOLS_TITLE)

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

val SkillItemStyle = CssStyle {
//    base {
//        Modifier.maxWidth(2.5.em)
//    }
}

val SkillItemImageVariant = ImageStyle.addVariant {
    Breakpoint.ZERO {
        Modifier.size(1.65.cssRem)
    }
    Breakpoint.SM {
        Modifier.size(1.75.cssRem)
    }
    Breakpoint.MD {
        Modifier.size(2.cssRem)
    }
    Breakpoint.LG {
        Modifier.size(2.25.cssRem)
    }
    Breakpoint.XL {
        Modifier.size(2.25.cssRem)
    }
}

@Composable
fun SkillItem(
    skill: Skill,
    colorMode: ColorMode = ColorMode.current,
    modifier: Modifier = Modifier,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
) {
    Row(
        modifier = SkillItemStyle.toModifier().then(modifier),
        horizontalArrangement = horizontalArrangement,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            src = if (colorMode.isLight) skill.iconResLight else skill.iconResDark,
            variant = SkillItemImageVariant,
        )
        Column(
            modifier = Modifier.margin(left = 0.75.cssRem),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            SpanText(
                text = skill.skillName,
                modifier = SkillTextStyle.toModifier()
            )
            SpanText(
                text = skill.level,
                modifier = SkillProficiencyTextStyle.toModifier()
            )
        }
    }
}