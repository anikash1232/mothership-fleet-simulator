# Mothership Power Management

A spaceship systems simulation in Java where power-consuming modules and power-producing
generators are composed through interfaces rather than inheritance.

## What it does

A mothership carries modules — shields, thrusters, experiments — each of which draws power.
It also carries generators that produce power from different sources: solar collection and
fuel burning. The ship has to balance what it can generate against what its modules demand,
and modules behave differently when power is short.

- Shield, thruster and experiment modules, each with its own power draw and behaviour
- Solar and fuel generators with different production characteristics
- A mothership that aggregates both and resolves supply against demand
- Shared module behaviour factored into an abstract base, contracts kept in interfaces

## Architecture

```
IModule           what every module must do
AModule           abstract base - shared state and default behaviour
  ShieldModule
  ThrusterModule
  ExperimentModule

IPowerGenerator   what every generator must do
  SolarGenerator
  FuelGenerator

Mothership        holds modules and generators, balances the power budget
```

Modules and generators are two separate interfaces, so the mothership can hold collections
of each without either knowing about the other. `AModule` carries the state and behaviour
every module shares, leaving concrete modules to implement only what makes them distinct —
which is why adding a new module type touches exactly one new file.

## Running it

Requires Java 17+ and Maven.

```bash
mvn clean compile exec:java
```
