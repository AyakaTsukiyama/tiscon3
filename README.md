# TISCON - card order

## 背景

とあるお客様が、新たにクレジットカード事業を展開することになりました。

事業に先立ち、いくつかのシステムを開発する必要があり、協業するSI企業を選定しているとのこと。

> この度、他社で展開していた事業を譲り受け、クレジットカード事業を行なっていくことになりました。

> 譲渡の対象には、カード業務を行う基盤システムの他、カード会員向けサイトと加盟店向けのサイトなどが含まれますが、入会前のユーザが利用するサイトはありません。

> 自社でオンライン入会システムの開発を試みたのですが、どうも出来栄えが悪く、社内でも不評です。。

> やっぱり餅は餅屋ですよね！そこで、信頼できるSI企業に開発をお願いしたいと思っています。

> 委託先の選定のため、技術コンペを開催しますので、御社もぜひご参加ください！

T社は技術コンペに参加することにしました。

## ミッション

**技術コンペに参加して、案件を獲得する。**

お客様は各社の技術力と提案内容を比較して、開発を委託する企業を選定します。
既存サイトの問題点をプロの視点で改善し、お客様の信頼を勝ち取ってください。

### 改善事項

以下は、お客様の社内で挙がった意見です。改善の参考にしてください。

 - 入力がめんどう
 - 入力すべき内容がわかりにくい
 - 入力エラーの表示が不親切（どう直したらよいかがわからない）
 - 該当ページにない項目のエラーもまとめて出るので直してほしい
 - 画面の表示速度はできるだけ早く

## 環境構築

下記リンクtiscon3-startup-guide内のREADMEを参考に、環境構築をしてください。
[【tiscon3-startup-guide】](https://github.com/tiscon/tiscon3-startup-guide)

# 参考
## 本プロジェクトの構成

```

tiscon3

└ src

 └ main

    ├ java

    │├ db.migration             #DBスキーマ、事前登録データの定義情報

    │└ jp.co.tis.tiscon3

    │  ├ component.thymeleaf    #システムで利用する拡張コンポーネント

    │  ├ configuration

    │  │  ├ ApplicationConfiguration.java     #ルート定義とmiddleware定義

    │  │  ├ DatabaseConfiguration.java        #データベースを利用するための定義

    │  │  └ SystemConfiguration.java          #システムが利用するコンポーネントの定義

    │  ├ controller             #リクエスト内容がURLマッチした時に実行されるコントローラー

    │  ├ dao                    #DBアクセス

    │  ├ entity                 #DBから取得した情報を保持する

    │  ├ form                   #画面からリクエストされた内容を保持する

    │  └ Application.java       #アプリケーションエントリーポイント

    └ resources

        ├ META-INF

        │ └ jp.co.tis.tiscon3.dao      #Daoに対応するSQLファイル

        ├ public                       #アプリケーションが公開する静的リソース

        └ template                     #画面表示する内容

```


---
## 使用技術
### Enkan
本アプリケーションはマイクロフレームワーク『Enkan』を使用して構築されています。
Enkanについて学びたい方は、以下を参考にしてください。
- [Getting Started(スタートガイド)](https://enkan.github.io/getting-started.html)
- [マイクロフレームワークEnkan(とKotowari)ではじめるREPL駆動開発](http://www.slideshare.net/kawasima/enkankotowarirepl)

### Java API
Javaで提供している標準のAPIです。
- [Java 8 API仕様](https://docs.oracle.com/javase/jp/8/docs/api/)

### Thymeleaf
ThymeleafはJavaのテンプレートエンジンライブラリです。
Thymeleafについて学びたい方は、以下を参考にしてください。
- [Thymeleafチュートリアル](http://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf_ja.html)

### Semantic UI
本アプリケーションの画面レイアウトには、デザインフレームワークSemantic UIを使用しています。
Semantic UIについて学びたい方は、以下を参考にしてください。
- [Getting Started(スタートガイド)](http://semantic-ui.com/introduction/getting-started.html)
　※左側のメニューから、各UI部品の解説・サンプル実装ページへ移動できます。

### HTMLリファレンス
本アプリケーションの画面を構成している技術要素です。
- [HTMLタグリファレンス](http://www.htmq.com/html/indexm.shtml)
- [CSSリファレンス](http://www.htmq.com/style/index.shtml)


