# 概要

ConstraintLayout 1 系では問題なく動いている layout が ConstraintLayout 2 系でも動くかを確認するコード

# 環境構築方法

Android Studio 3.5 (新しめのバージョン) を用意して、下記にて構築を確認する


```
./gradlew assembleDebug
```

# 動作確認方法

Android Studio の Build Variants にて下記をそれぞれを選択して構築する

|Active Build Variant| 動作バージョン | アイコンの間隔 |
|--------------------|--------------|--------------|
| oneDebug           | 1.1.3        | 収縮する      |
| twoDebug           | 2.0.0-beta2  | 固定のまま    |
| twoDebug           | 2.0.0-beta3  | 収縮する      |


アプリ起動後、下部の Padding スイッチを On/Off すると灰色背景のエリアの右側のマージンが変化する。
同時に アイコンの間隔が収縮することが期待される。

ConstraintLayout 2.0.0-beta3 にて不具合が解消された模様！

[View not centered correctly with margin](https://issuetracker.google.com/issues?q=142755253)