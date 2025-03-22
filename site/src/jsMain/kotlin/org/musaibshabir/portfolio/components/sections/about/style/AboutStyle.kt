package org.musaibshabir.portfolio.components.sections.about.style

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.style.extendedBy
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.keywords.auto
import org.musaibshabir.portfolio.components.styles.SectionContainerStyle

val AboutStyle = SectionContainerStyle.extendedBy {

    base {
        Modifier
            .height(auto)
            .padding { bottom(5.cssRem) }
    }

}