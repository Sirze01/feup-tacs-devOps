# DevOps Equalizer
Model-driven DSL and tooling for representing CI/CD pipelines using provider agnostic representation.

## Development reports
- [Domain anlysis and modelling language design](docs/Domain_analysis_and_modelling_language_design.md)
- [Concrete graphical syntax and model to text (final report)](docs/Concrete_graphical_syntax_and_model_to_text.md)

## Usage

This is an Eclipse project, using the EMF framework. Make sure you have an updated Eclipse version with EMF, Sirius and Acceleo installed.

### Source code generation

First, import the project (`devOps`) into Eclipse.

To procceed with diagram and text generation, make sure to generate the source code based on the created metamodel:

```
Open devOps/model/devOps.genmodel -> Right click on root node -> Generate All
```

Next steps should be executed on a new Eclipse instance that knows about the generated metamodel.

```
Right click on devOps/ -> Run As -> Eclipse Application
```

On the new instance, import subdirectories inside `runtime-New_configuration`.

### Diagram generation

You can generate a diagram based on our `.odesign` file. To do so, right click on a model (`.devops` file) and select `New Representation`.

### Text generation

Our `.mtl` file dictates the text generation rules for our metamodel. To generate text for a model:

```
Right click on generated.mtl -> Run As -> Launch Acceleo Application
```

Modify the launch configuration to point to the model you want to generate text for. You can use `src-gen` as the output directory.