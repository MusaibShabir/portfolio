package org.musaibshabir.website.components.styles

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val SectionContainerStyle = CssStyle {
    base {
        Modifier
            .width(100.percent)
            .height(auto)
            .maxWidth(130.cssRem)
            .classNames("section-container")
    }
    Breakpoint.ZERO {
        Modifier.padding(leftRight = 16.px)
    }
    Breakpoint.SM {
        Modifier.padding(leftRight = 28.px)
    }
    Breakpoint.MD {
        Modifier.padding(leftRight = 48.px)
    }
    Breakpoint.LG {
        Modifier.padding(leftRight = 94.px)
    }
    Breakpoint.XL {
        Modifier.padding(leftRight = 134.px)
    }
}