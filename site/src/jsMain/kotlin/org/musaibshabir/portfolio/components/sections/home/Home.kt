package org.musaibshabir.portfolio.components.sections.home


import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.AnimationTimingFunction
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s
import org.jetbrains.compose.web.dom.Div
import org.musaibshabir.portfolio.SitePalette
import org.musaibshabir.portfolio.SubheadlineTextStyle
import org.musaibshabir.portfolio.components.HeroContainerKeyFrames
import org.musaibshabir.portfolio.components.UserNameStyle
import org.musaibshabir.portfolio.components.UsersMessageStyle
import org.musaibshabir.portfolio.components.sections.home.components.SocialLinksRow
import org.musaibshabir.portfolio.components.sections.home.style.HelloImStyle
import org.musaibshabir.portfolio.components.sections.home.style.HeroSectionStyle
import org.musaibshabir.portfolio.components.styles.MainButtonStyle
import org.musaibshabir.portfolio.components.utils.Res

@Composable
fun Home(
    currentPalette: SitePalette
) {

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = HeroSectionStyle.toModifier().animation(HeroContainerKeyFrames.toAnimation(
                duration = 2.s,
                timingFunction = AnimationTimingFunction.EaseInOut
            )),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {

            SpanText(
                text = Res.Constants.GREETING,
                modifier = HelloImStyle.toModifier()
                    .fontWeight(FontWeight.Lighter)
            )
            SpanText(
                text = Res.Constants.NAME,
                modifier = UserNameStyle.toModifier()

                    .fontWeight(FontWeight.Bold)
            )

            Div(
                SubheadlineTextStyle.toModifier()
                    .color(currentPalette.subHeadLine)
                    .margin(top = 5.px)
                    .toAttrs()
            ) {
                SpanText(
                    text = Res.Constants.SUB_HEADLINE,
                    modifier = UsersMessageStyle.toModifier()
                        .color(currentPalette.subHeadLine)

                )
            }

            val ctx = rememberPageContext()


            SocialLinksRow()

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 2.cssRem)
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(2.cssRem)
            ) {

                Button(
                    onClick = {
                        ctx.router.navigateTo(Res.Constants.RESUME_URL)
                    },
                    size = ButtonSize.MD,
                    modifier = MainButtonStyle.toModifier()
                        .background(currentPalette.buttonBackground)
                        //.width(120.px)
                ) {
                    SpanText(
                        text = Res.Constants.RESUME,
                        modifier = Modifier
                            .color(currentPalette.buttonText)
                            .fontFamily("Lexend")
                    )
                }

            }

        }


    }

}
