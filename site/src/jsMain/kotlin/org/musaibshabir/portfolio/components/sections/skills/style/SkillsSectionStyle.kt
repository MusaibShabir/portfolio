package org.musaibshabir.portfolio.components.sections.skills.style

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.vh

val SkillsSectionStyle = CssStyle {
    val colorPalette = colorMode.toPalette()
    base {
        Modifier
            .height(30.vh)
    }
    Breakpoint.ZERO {
        Modifier
            .maxWidth(100.percent)
//            .backgroundImage(
//                radialGradient(RadialGradient.Shape.Circle, CSSPosition(x = 50.percent, y = 30.percent)) {
//                    //add(colorPalette.brand.primary.toRgb().copyf(alpha = if (colorMode.isDark) 0.1f else 0.2f))
//                    add(Colors.Transparent, 50.percent)
//                }
//            )
    }
    Breakpoint.SM {
        Modifier.maxWidth(100.percent)
    }
    Breakpoint.MD {
        Modifier
            .maxWidth(100.percent)
//            .backgroundImage(
//                radialGradient(RadialGradient.Shape.Circle, CSSPosition(x = 50.percent, y = 50.percent)) {
//                    //add(colorPalette.brand.primary.toRgb().copyf(alpha = if (colorMode.isDark) 0.1f else 0.2f))
//                    add(Colors.Transparent, 63.percent)
//                }
//            )
    }
    Breakpoint.LG {
        Modifier.maxWidth(100.percent)
    }
    Breakpoint.XL {
        Modifier.maxWidth(70.percent)
    }
}