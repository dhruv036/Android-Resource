1. To enable bluetooth automatically works till android 12. 
2. Android 13 don't allow to enable bluetooth automatically. User need to enable
3. Common permission  
```xml
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN"/>
```

```java
val mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter()  
		if (mBluetoothAdapter.isEnabled) {  
			mBluetoothAdapter.disable()  
		}

```
