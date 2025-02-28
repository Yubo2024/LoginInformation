Kotlin 用户登录与信息展示应用项目介绍
一、项目概述
本项目是一个基于 Android 平台开发的 Kotlin 语言小型应用，旨在实现一个简单的 用户登录与信息展示功能。应用包含 两个主要界面，分别是 用户登录界面 和 用户信息展示界面。在登录界面，用户需要输入姓名和年龄，点击“Login”按钮后，应用会将用户输入的数据传递到信息展示界面，并在该页面显示用户的姓名和年龄。整个应用结构清晰，代码简洁，适合 Kotlin 初学者 或 Android 开发入门者 进行学习和实践。

二、项目功能介绍
1. 用户输入功能
应用的 登录界面（MainActivity） 主要由 两个输入框（EditText） 和 一个按钮（Button） 组成，用户可以在输入框中输入自己的姓名和年龄。应用在用户点击按钮后，会获取用户输入的数据，并通过 Intent 机制 传递到信息展示页面。

2. 页面跳转功能
在用户填写完信息并点击“Login”按钮后，应用会触发 页面跳转逻辑，进入 信息展示界面（UserInfoActivity）。跳转时，应用会将用户输入的数据通过 Intent 传递到新页面，以便在信息展示页面进行显示。

3. 数据传递与展示功能
应用采用 Intent 的 putExtra() 方法 将用户的姓名和年龄作为参数传递到 UserInfoActivity，并在 UserInfoActivity 中使用 getStringExtra() 和 getIntExtra() 方法接收数据。接收到数据后，信息展示页面会将其显示在 TextView 组件上，让用户可以看到自己输入的信息。

三、核心技术实现
1. 采用 Kotlin 语言
本项目的所有逻辑均使用 Kotlin 语言 编写，符合现代 Android 开发标准，具有更简洁的代码结构和更强的可读性，相较于 Java 具有更高的开发效率。

2. ConstraintLayout 布局
在 XML 布局文件中，采用 ConstraintLayout 进行界面布局，使 UI 元素能够自适应不同屏幕尺寸，保持良好的用户体验。

3. Intent 传递数据
应用使用 显式 Intent 在不同 Activity 之间进行跳转，并利用 Intent 的 putExtra() 方法 实现数据传递，确保用户输入的姓名和年龄能够在信息展示页面正确显示。

4. AndroidManifest.xml 配置
为了确保页面可以正常跳转，项目在 AndroidManifest.xml 文件中注册了 UserInfoActivity，保证应用可以正确识别并启动该 Activity。

四、应用运行流程
用户打开应用，进入 登录界面（MainActivity）。
用户在 姓名输入框 和 年龄输入框 中输入个人信息。
用户点击 “Login” 按钮，应用获取输入数据，并通过 Intent 进行页面跳转。
进入 信息展示界面（UserInfoActivity），应用接收用户输入的数据，并在 TextView 中展示姓名和年龄。
用户可以看到自己输入的信息，并确认数据是否正确。
五、代码结构分析
1. activity_main.xml（登录界面 XML 布局）
该文件定义了 输入框、按钮和文本视图，用于用户输入信息并进行跳转。

2. MainActivity.kt（登录界面逻辑）
负责 获取用户输入信息
通过 Intent 传递数据
实现 页面跳转逻辑
3. activity_user_info.xml（信息展示界面 XML 布局）
该文件包含一个 TextView，用于展示用户的姓名和年龄。

4. UserInfoActivity.kt（信息展示界面逻辑）
负责 接收 Intent 传递的数据
通过 TextView 显示用户输入的姓名和年龄
六、适用场景
Android 开发入门学习：本项目结构清晰，代码简洁，非常适合 Kotlin 初学者 或 Android 开发入门者 练习页面跳转和数据传递。
简单登录界面 Demo：可以作为 用户登录界面的基础模板，为后续更复杂的功能（如数据库存储、网络请求、用户身份验证等）打下基础。
Intent 传递数据示例：本项目提供了 Activity 之间数据传递 的标准示例，适用于其他需要 页面传递信息 的应用场景。
