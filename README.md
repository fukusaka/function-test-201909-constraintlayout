# 概要

ConstraintLayout 1 系では問題なく動いている layout が ConstraintLayout 2 系でも動くかを確認するコード

※ 現在 2.0.0-beta2 では動いていないです。

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


アプリ起動後、下部の Padding スイッチを On/Off すると灰色背景のエリアの右側のマージンが変化する。
同時に アイコンの間隔が収縮することが期待される。

実際は ConstraintLayout 2 系はアイコンの間隔が固定のままとなる

