package org.musaibshabir.website.components.sections.home.style

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.extendedBy
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.vh
import org.musaibshabir.website.components.styles.SectionContainerStyle

val HeroSectionStyle = SectionContainerStyle.extendedBy{

    Breakpoint.ZERO {
        Modifier
            .fontSize(2.5.cssRem)
            .height(100.vh)
    }
    Breakpoint.SM {
        Modifier
            .fontSize(2.5.cssRem)
            .height(100.vh)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(2.75.cssRem)
            .height(100.vh)
    }
    Breakpoint.LG {
        Modifier

            .fontSize(3.cssRem)
            .height(90.vh)

    }
}

val HelloImStyle = CssStyle{

    base {

        Modifier.fontSize(FontSize.Medium).margin(top = 2.cssRem)
    }


    Breakpoint.SM {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XXLarge)
    }
}