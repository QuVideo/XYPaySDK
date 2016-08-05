Thanks for [pingpp-android](https://github.com/PingPlusPlus/pingpp-android)

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

## Contact me

Any further question?

[Email](mailto:tmac694449212@gmail.com) me please!

## License

        Copyright 2016 xiyouMc

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.

        