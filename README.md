# Canyon World

> Overworld is plateaus and canyons. Y 60-180 is the playable plateau surface; canyons cut down to Y 0-30 with rivers along the floor. Vertical movement is the game; bridges, ladders, gliders, and ropes are essential.

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![NeoForge 1.21.1](https://img.shields.io/badge/NeoForge-1.21.1-orange.svg)](https://neoforged.net)
[![Depends on Isekai API](https://img.shields.io/badge/Depends-Isekai%20API-9333ea)](https://github.com/KURONAMI333/isekai-api)

---

## Concept

A world of two elevations — a plateau top where villages and trees sit, and a canyon floor with rivers and forests. Drop into a canyon: 120+ block fall. The vanilla "walk forward to traverse" assumption breaks; planning vertical routes is the gameplay loop.

Pairs naturally with bridge mods (YUNG's Bridges), climbing mods, glider / parachute mods.

## How it works

Canyon World is built on **[Isekai API](https://github.com/KURONAMI333/isekai-api)**, a neutral universal worldgen library.

The library has no concept of "mesa" or "canyon" — Canyon World composes `step` (high vs low plateau), `mask_y_range` (band separation), and rule-adaptation primitives to express the plateau / canyon worldshape. Plateau-top structure placement and canyon-floor structure placement are expressed via `SpatialPredicate` combinations like `And(YInRange(60, 180), SolidFloor(2))`.

## Status

**v0.1**: skeleton. `WorldshapeDescriptor` declaration + density composition land with Isekai API v0.2.

## Dependencies

- NeoForge 1.21.1
- [Isekai API](https://github.com/KURONAMI333/isekai-api) (required)

## License

[MIT License](LICENSE) — modpack inclusion welcome, no credit required.

## Credits

- Author: KURONAMI
