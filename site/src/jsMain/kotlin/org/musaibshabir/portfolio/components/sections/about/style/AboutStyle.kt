package org.musaibshabir.portfolio.components.sections.about.style

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.extendedBy
import org.jetbrains.compose.web.css.cssRem
import org.musaibshabir.portfolio.components.styles.SectionContainerStyle

val AboutStyle = SectionContainerStyle.extendedBy {
    base {
        Modifier
            .fontSize(3.cssRem)

    }
    Breakpoint.ZERO {
        Modifier
            .fontSize(2.5.cssRem)

    }
    Breakpoint.SM {
        Modifier
            .fontSize(2.5.cssRem)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(2.75.cssRem)

    }
    Breakpoint.LG {
        Modifier
            .fontSize(3.cssRem)
    }
}