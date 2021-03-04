package space.kscience.plotly.fx

import io.ktor.server.engine.ApplicationEngine
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import tornadofx.*

class PlotlyFXController : Controller() {

    val scale = SimpleIntegerProperty(1)

    private var server: ApplicationEngine? = null

    fun startServer() {
        GlobalScope.launch(Dispatchers.Default) {
            log.info("Starting server")
            server = serve(scale)
            log.info("Server started")
            runLater {
                displayPage(pages.first())
            }
        }
    }

    val pages = observableListOf(
        "Dynamic",
        "Static"
    )

    val address = SimpleStringProperty()

    fun displayPage(page: String) {
        if (server != null) {
            address.set(ADDRESS_BASE + page)
        }
    }

    companion object {
        const val ADDRESS_BASE = "http://localhost:7777/"
    }
}