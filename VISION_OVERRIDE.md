# PhoneClaw Vision Override: Moondream → OpenAI

## Changes Made

Replaced Moondream API with OpenAI Vision API for:
1. `magicClicker()` - finding clickable elements
2. `magicScraper()` - reading text from screen

## Why?

- ✅ OpenAI Vision is more powerful
- ✅ API key already available on lifeos
- ✅ No registration/token needed
- ✅ Better accuracy for UI automation

## Environment

OPENAI_API_KEY is configured in build workflow via GitHub Actions.

No manual setup needed - builds automatically.
