import space.kscience.plotly.*
import space.kscience.plotly.models.Trace
import space.kscience.plotly.models.invoke
import space.kscience.plotly.palettes.T10
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Suppress("DEPRECATION")
@UnstablePlotlyAPI
fun main() {

    val x = (0..100).map { it.toDouble() / 100.0 }
    val y1 = x.map { sin(2.0 * PI * it) }
    val y2 = x.map { cos(2.0 * PI * it) }

    val trace1 = Trace(x, y1) {
        name = "sin"
        marker.color(T10.BLUE)

    }

    val trace2 = Trace(x, y2) {
        name = "cos"
        marker.color(T10.ORANGE)

    }

    val responsive = PlotlyConfig{
        responsive = true
    }

    val plot = Plotly.tabs {

        tab("First"){
            plot (config = responsive){
                traces(trace1)
                layout {
                    title = "First graph"
                    xaxis.title = "x axis name"
                    xaxis.title = "y axis name"
                }
            }
        }
        tab("Second"){
            plot(config = responsive) {
                traces(trace2)
                layout {
                    title = "Second graph"
                    xaxis.title = "x axis name"
                    xaxis.title = "y axis name"
                }
            }
        }
    }

    plot.makeFile()
}
