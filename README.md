![](./docs/images/menu_logo_wecross.png)

# WeCross-BCOS2-Stub

[![CodeFactor](https://www.codefactor.io/repository/github/webankblockchain/WeCross-BCOS2-Stub/badge)](https://www.codefactor.io/repository/github/webankblockchain/WeCross-BCOS2-Stub) [![Build Status](https://travis-ci.org/WeBankFinTech/WeCross-BCOS2-Stub.svg?branch=dev)](https://travis-ci.org/WeBankFinTech/WeCross-BCOS2-Stub) [![Latest release](https://img.shields.io/github/release/WeBankFinTech/WeCross-BCOS2-Stub.svg)](https://github.com/WeBankFinTech/WeCross-BCOS2-Stub/releases/latest)
[![License](https://img.shields.io/github/license/WeBankFinTech/WeCross-BCOS2-Stub)](https://www.apache.org/licenses/LICENSE-2.0) [![Language](https://img.shields.io/badge/Language-Java-blue.svg)](https://www.java.com)

WeCross BCOS2 Stub是[WeCross](https://github.com/WeBankFinTech/WeCross)用于适配[FISCO BCOS 2.6](https://github.com/FISCO-BCOS/FISCO-BCOS)及以上版本的插件。

## 关键特性

- FISCO BCOS配置加载
- FISCO BCOS账户生成
- FISCO BCOS链上资源访问
- FISCO BCOS交易签名与解析
- FISCO BCOS交易默克尔验证

## 插件编译

**环境要求**:

  - [JDK8及以上](https://www.oracle.com/java/technologies/javase-downloads.html)
  - Gradle 5.0及以上

**编译命令**:

```bash
git clone https://github.com/WeBankFinTech/WeCross-BCOS2-Stub.git
cd WeCross-BCOS2-Stub
./gradlew assemble
```
如果编译成功，将在当前目录的dist/apps目录下生成两个jar包，分别是国密版和非国密版插件。

## 插件使用

插件的详细使用方式请参阅[WeCross技术文档](https://wecross.readthedocs.io/zh_CN/latest/docs/stubs/bcos.html#id2)

## 贡献说明

欢迎参与WeCross社区的维护和建设：

- 提交代码(Pull requests)，可参考[代码贡献流程](CONTRIBUTING.md)以及[wiki指南](https://github.com/WeBankFinTech/WeCross/wiki/%E8%B4%A1%E7%8C%AE%E4%BB%A3%E7%A0%81)
- [提问和提交BUG](https://github.com/WeBankFinTech/WeCross-BCOS2-Stub/issues/new)

希望在您的参与下，WeCross会越来越好！

## 社区
联系我们：wecross@webank.com

## License

![license](http://img.shields.io/badge/license-Apache%20v2-blue.svg)

WeCross BCOS2 Stub的开源协议为[Apache License 2.0](http://www.apache.org/licenses/)，详情参考[LICENSE](./LICENSE)。
