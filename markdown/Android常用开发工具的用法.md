### 1. AVD
* Android Virtual Device Android 运行的虚拟设备。
* 命令
	* list:列出机器上所有已经安装的Android版本和AVD设备
	* list avd:列出机器上所有已有安装的AVD设备
	* list target:列出机器上所有已安装的Android版本
	* create avd：创建一个AVD设备
	* move avd:移动或重命名一个AVD设备
	……
### 2. 使用Android模拟器(Emulator)
* 运行模拟器在sdk/emulator/下 执行以下命令：
````
emulator @ xxx 或者 emulator -avd xxx //运行名为xxx的模拟器
````
### 3. 使用Monitor进行调试

* 运行Monitor
````
//配置好环境变量后,可直接在终端执行命令
monitor
````
* Monitor的几个重要面板
	* 设备面板：窗口左上角的面板会列出所有运行的手机（包括真机和模拟器）
	* 信息输出面板：位于窗口下方
	* 线程跟踪面板：查看指定进程内所有执行线程的状态。
	* Heap 内存跟踪面板：
	* 模拟器控制面板：设置虚拟位置
	* 文件管理器面板
#### 4. ADB的用法
* 查看当前运行的模拟器
````
adb devices
````
* 电脑与手机之间的文件相互复制

在默认情况下，ADB工具总是操作当前正在运行的模拟器，如果需要将电脑文件复制到模拟器中，可以使用命令
````
adb push
````
