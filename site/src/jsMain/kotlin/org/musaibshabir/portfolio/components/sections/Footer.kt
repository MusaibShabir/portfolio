package org.musaibshabir.portfolio.components.sections

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.layout.HorizontalDivider
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.coroutines.delay
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.musaibshabir.portfolio.components.sections.home.components.SocialLinkButton
import org.musaibshabir.portfolio.components.styles.MainButtonStyle
import org.musaibshabir.portfolio.components.utils.Res
import org.musaibshabir.portfolio.toSitePalette
import kotlin.js.Date
import kotlin.time.Duration.Companion.seconds


val FooterStyle = CssStyle.base {
    Modifier
        //.backgroundColor(colorMode.toSitePalette().nearBackground)
        .padding(topBottom = 1.5.cssRem, leftRight = 10.percent)
}

@Composable
fun Footer(modifier: Modifier = Modifier) {
    Column (
        modifier = FooterStyle.toModifier()
            .fillMaxWidth()
    ){
        Row (
            modifier = modifier
                .fillMaxWidth()
                .padding { bottom(3.cssRem) },
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){

            val ctx = rememberPageContext()
            val currentPalette = ColorMode.current.toSitePalette()
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
                    text = Res.Constants.EMAIL,
                    modifier = Modifier
                        .color(currentPalette.buttonText)
                        .fontFamily("Lexend")
                )


            }

            ContactLinksRow()


        }

        Row (
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){

            CopyrightInfo()


            Column (
                modifier = modifier
                    .width(23.cssRem),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                TimeDisplay(timeZone = "Asia/Kolkata")
                HorizontalDivider()
                DeveloperLocation()

            }


        }

    }
}

@Composable
fun CopyrightInfo() {

    SpanText(
        text = getCopyrightText(),
        modifier = Modifier
            .fillMaxWidth()
            .color(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Colors.Gray
                    ColorMode.DARK -> Colors.LightGray
                }
            )
    )
}

fun getCopyrightText(): String {
    // Get the current year using kotlinx-datetime
    val currentYear = Date().getFullYear().toString()
    return "© $currentYear | Developed by Musaib Shabir"
}


@Composable
fun TimeDisplay(timeZone: String) {

    var currentTime by remember { mutableStateOf(getFormattedTime(timeZone)) }

    LaunchedEffect(Unit) {
        while (true) {
            currentTime = getFormattedTime(timeZone)
            delay(1.seconds)
        }
    }

    SpanText(
        text = currentTime,
        modifier = Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .color(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Colors.Gray
                    ColorMode.DARK -> Colors.LightGray
                }
            )
    )
}

// Function to get the formatted time for a specific time zone
fun getFormattedTime(timeZone: String): String {
    val options = js("{ timeZone: timeZone, hour: '2-digit', minute: '2-digit', second: '2-digit', hour12: true }")
    return Date().toLocaleTimeString("en-US", options)
}

@Composable
fun DeveloperLocation() {

    Row (
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){

        FaLocationArrow(
            modifier = Modifier
                .padding(right = .5.cssRem)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.LightGray
                    }
                )
        )
        SpanText(
            text = "Srinagar J&K India 190010",
            modifier = Modifier
                .fillMaxWidth()
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.LightGray
                    }
                )
        )
    }

}

@Composable
fun ContactLinksRow() {
    Row(
        modifier = Modifier
            .borderRadius(1.cssRem)
    ) {
        SocialLinkButton(
            "phone:+917889816656"
        ) { FaPhone(size = IconSize.XL) }

        SocialLinkButton(
            "https://x.com/musaib_shabir"
        ) { FaSlack(size = IconSize.XL) }

        SocialLinkButton(
            "https://www.hackerrank.com/profile/musaibshabir"
        ) { FaDiscord(size = IconSize.XL) }

        SocialLinkButton(
            "https://medium.com/@musaib.shabir"
        ) { FaWhatsapp(size = IconSize.XL) }

        SocialLinkButton(
            "https://www.linkedin.com/in/musaibshabir"
        ) { FaTelegram(size = IconSize.XL) }
    }
}
