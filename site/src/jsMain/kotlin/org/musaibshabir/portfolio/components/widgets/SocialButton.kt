package org.musaibshabir.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*

@Composable
fun SocialButton(
    iconUrl: String,
    link: String,
    altText: String,
) {
    Button(
        onClick = { window.open(link, "_blank") }, // Open in new tab
        modifier = Modifier
            .padding(2.px)
            .borderRadius(0.px) // No border radius
            .background(Color.transparent) // Transparent background
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .border(0.px, LineStyle.None) // Remove any border
    ) {
        Image(
            src = iconUrl,
            alt = altText,
            modifier = Modifier
                .width(30.px)
                .height(30.px)
                .color(Colors.Green)
        )
    }


}

