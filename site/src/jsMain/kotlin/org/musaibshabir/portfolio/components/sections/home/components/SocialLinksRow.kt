package org.musaibshabir.portfolio.components.sections.home.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.musaibshabir.portfolio.components.styles.SocialLinkStyle
import org.musaibshabir.portfolio.components.widgets.LinkButton

@Composable
fun SocialLinksRow() {
    Row(
        modifier = Modifier
            .borderRadius(1.cssRem)
    ) {
        SocialLinkButton(
            "https://github.com/MusaibShabir"
        ) { FaGithub(size = IconSize.XXL) }

        SocialLinkButton(
            "https://www.linkedin.com/in/musaibshabir"
        ) { FaLinkedin(size = IconSize.XXL) }

        SocialLinkButton(
            "https://x.com/musaib_shabir"
        ) { FaXTwitter(size = IconSize.XXL) }

        SocialLinkButton(
            "https://www.hackerrank.com/profile/musaibshabir"
        ) { FaHackerrank(size = IconSize.XXL) }

        SocialLinkButton(
            "https://medium.com/@musaib.shabir"
        ) { FaMedium(size = IconSize.XXL) }

        SocialLinkButton(
            "mailto:itzmusaibshabir@gmail.com"
        ) { FaEnvelope(size = IconSize.XXL) }
    }
}

@Composable
internal fun SocialLinkButton(url: String, icon: @Composable () -> Unit) {
    LinkButton(
        url,
        modifier =  SocialLinkStyle.toModifier()
            .margin(topBottom = 18.px)
            .color(
            when (ColorMode.current) {
                ColorMode.LIGHT -> Colors.Black
                ColorMode.DARK -> Colors.White
            }
        )
            .backgroundColor(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Colors.Transparent
                    ColorMode.DARK -> Colors.Transparent
                }
            )
    ) {
        icon()
    }
}


