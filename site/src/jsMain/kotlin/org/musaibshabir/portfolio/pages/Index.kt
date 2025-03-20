package org.musaibshabir.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.musaibshabir.portfolio.components.layouts.DefaultPageLayout
import org.musaibshabir.portfolio.toSitePalette
import org.musaibshabir.portfolio.components.sections.home.Home

@Page
@Composable
fun HomePage() {
    DefaultPageLayout("Home") {

        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            val currentPalette = ColorMode.current.toSitePalette()


            Home(currentPalette = currentPalette)

            //About()

            //SkillsAndTools()
        }
    }

}

