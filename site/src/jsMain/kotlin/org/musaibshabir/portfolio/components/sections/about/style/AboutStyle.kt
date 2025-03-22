package org.musaibshabir.portfolio.components.sections.about.style

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.extendedBy
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.vh
import org.musaibshabir.portfolio.components.styles.SectionContainerStyle

val AboutStyle = SectionContainerStyle.extendedBy {

    base {
        Modifier
            .height(auto)
    }

}