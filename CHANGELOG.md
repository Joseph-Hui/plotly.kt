# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Added

### Changed
- build tools 0.10.0

### Deprecated

### Removed

### Fixed
- #80
- Plotly coordinate array wrap is moved to the server side

### Security
## [0.4.3]

### Fixed
- Proper deserialization of single plot.
- A bug in jupyter lab visualization

### Security

## [0.4.2]

### Added
- `automargin` property to `Axis` according to https://plotly.com/python/reference/layout/xaxis/#layout-xaxis-automargin

### Fixed
- Remove unnecessary `kotlinx-css` dependency.
- Added compatibility mode for legacy notebooks. Use `Plotly.jupyter.notebook()` call to enable legacy mode.

### Security
## [0.4.0]
### Added
- Jupyter integration plugin for server
- Separate static plot integration module in `plotlykt-jupyter`
- Expanded JS demo
- Jupyter support goes beta

### Changed
- Package change (again) to `space.kscience`
- Build tools `0.9.5`
- Kotlin `1.5.0`
- HtmlFragment renamed to PlotlyHtmlFragment

### Deprecated

### Removed
- Local bootstrap

### Fixed
- Incomplete coverage in JS (#70)

### Security

## [0.3.1]
### Added
- Table widget implementation by @ArtificialPB
- Mathjax header promoted to stable
- Tabbed plots layout (experimental)
- Trace value builders for functions and ranges (experimental)

### Changed
- **Breaking API change!** Trace `text` replaced by `TraceValues`
- Moved to DataForge 0.3 API
- Kotlin 1.4.30
- **JVM-IR**  
- Plot `Config` moved to constructor
- Replaced direct color accessor by a delegate

### Deprecated

### Removed

### Fixed
- https://github.com/mipt-npm/plotly.kt/issues/53
- Add JQuery to Bootstrap headers

### Security

## [0.3.0]
### Added
-Support for `plotly.kts` in IDEA

### Changed
- Serialization API is encapsulated (not longer exposed) in order to provide compatibility with new serialization.
- Migration to Kotlin 1.4
- Minor breaking change in Plot to encapsulate serialization usage
- JS supports IR. LEGACY is not supported anymore.

### Fixed
- https://github.com/mipt-npm/plotly.kt/issues/51

## [0.2.0]

### Added
- Experimental scripting support
- Static export via Orca
- Experimental Jupyter support
- Color palettes (T10 and XKCD)
- New parameters and classes in Trace, Legend, Layout
- Parameters description
- naming.md with decisions about parameters and methods names 
- Error bars
- New scatter, contour, error plots  examples
- Interfaces with common parameters for some plots (Histogram, Contour, Heatmap)
- New parameters for different plots
- Add Z axis
- Tutorial about drawing sinus
- Loading resources using krangl
- TraceValues extension for krangl columns

### Changed

- Migrated from `scientifik` to `kscience`
- Refactored packages to better suit star import style
- Removed bootstrap dependency
- Examples colors changed and more cases for each example added
- Different types of plots were inherited from Trace
- Unnecessary constructors removed
- Change Title methods
- Project structure updated
- Removed other Plot functions
- Plot2D renamed to Plot
