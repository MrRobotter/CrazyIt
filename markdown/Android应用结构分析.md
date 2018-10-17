# Android应用结构分析
### 两个问题
* [findViewById(R.id.show)]()R.id.show是什么？从哪里来？
* 为何setContentView(R.layout.activity_main)；代码设置使用activity_main文件定义的界面布局？
### 创建一个应用：
````
android create project -n HelloWorld -t android-21 -p HelloWorld -k org.crazyit.hello -a MainActivity
````
### 文件介绍
* 自动生成的R.java
	资源字典，由AAPT工具根据应用中的资源文件自动生成的
	规则如下：
	* 每类资源都对应于R类的内部类。如布局内部类 layout 颜色内部类 color 字符内部类 string
	* 每个具体的资源项都对应于内部类的一个public static final int 类型的Field 比如mipmap-xxx文件包含 ic-launcher.png图片，因此R.mipmap类里面就包含了ic_launcher Field.
在项目结构选择`packages`下可以查看

* res目录说明
	* java代码中使用资源
	* xml文件中使用资源
* Android应用的清单文件: AndroidMainfiest.xml
	* 应用的包名，该包名将会作为该应用的唯一标识
	* 应用程序所包含的组件：Activity、Service、BroadcastReceiver and ContentProvider
	* 应用程序兼容的最低版本
	* 应用程序使用系统的权限声明
	* 其他程序访问该应用所需的权限说明
### 基本组件介绍
* Activity和View
* Service
* BroadcastReceiver
* ContentProvider和ContentResolver
* Intent和IntentFilter

#### 界面编程与视图(View)组件
继承结构
````
					View
					  |
			___________________
			|
		ViewGroup     
````

#### Context

````
							Context(abs)
								  |
					__________________________
					|
			ContextWrapper
					|
			_____________________
			|                   |
	ContextThemeWrapper      Service(abs)
		        |
		     Activity

````
