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
import org.musaibshabir.portfolio.components.utils.Res
import org.musaibshabir.portfolio.components.widgets.LinkButton

@Composable
fun SocialLinksRow() {
    Row(
        modifier = Modifier
            .borderRadius(1.cssRem)
    ) {
        SocialLinkButton(
            Res.Constants.GITHUB_URL
        ) { FaGithub(size = IconSize.XXL) }

        SocialLinkButton(
            Res.Constants.LINKEDIN_URL

        ) { FaLinkedin(size = IconSize.XXL) }

        SocialLinkButton(
            Res.Constants.TWITTER_URL

        ) { FaXTwitter(size = IconSize.XXL) }

        SocialLinkButton(
            Res.Constants.HACKER_RANK_URL

        ) { FaHackerrank(size = IconSize.XXL) }

        SocialLinkButton(
            Res.Constants.MEDIUM_URL

        ) { FaMedium(size = IconSize.XXL) }

        SocialLinkButton(
            Res.Constants.MAIL_TO

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


