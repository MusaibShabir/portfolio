package org.musaibshabir.portfolio.components.widgets

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.forms.ButtonKind
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.style.CssStyleVariant
import com.varabyte.kobweb.silk.style.addVariant
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.musaibshabir.portfolio.toSitePalette

object ButtonColors {

    val NormalButton: CssStyleVariant<ButtonKind> = ButtonStyle.addVariant {
        val color = colorMode.toSitePalette()
        base {
            Modifier
                .backgroundColor(Colors.White)
        }
        hover {
            Modifier
                .backgroundColor(Colors.White.copyf(23f))
        }
    }
}

enum class ButtonShape {
    RECTANGLE,
    CIRCLE
}

fun getButtonModifier(shape: ButtonShape): Modifier {
    return Modifier.padding(0.px).then(if (shape == ButtonShape.CIRCLE) {
        Modifier.borderRadius(50.percent)
    } else {
        Modifier.padding(12.px).borderRadius(8.px)
    })
}