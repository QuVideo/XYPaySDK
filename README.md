
# VivaVideo Payments
Make your payments more easy to use.


##Dependency

```
dependencies{
    compile 'com.vivavideo.mobile:xypayapi:1.1.1684'
    compile 'com.vivavideo.mobile:xypaycore:1.1.168401@aar'
}
```

##Usage


```
payService.debug(true); // debug control.
payService.startPayment(context, charge, new XYPayCallback() { // create payment
       @Override
       public void result(String result, String errorMsg, String extraMsg) {        
                }
            });
```

##Utils
```
├──xypayapi/XYPayUtil.java
│............└── channels(wx、alipay、bd...)
├──xypaycore/XYPayServiceImpl.java
│............└── startPayment、debug
```
        