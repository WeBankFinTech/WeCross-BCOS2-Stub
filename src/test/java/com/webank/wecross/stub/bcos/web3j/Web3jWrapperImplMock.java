package com.webank.wecross.stub.bcos.web3j;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.math.BigInteger;
import org.fisco.bcos.channel.client.TransactionSucCallback;
import org.fisco.bcos.web3j.protocol.ObjectMapperFactory;
import org.fisco.bcos.web3j.protocol.Web3j;
import org.fisco.bcos.web3j.protocol.core.methods.response.*;

public class Web3jWrapperImplMock implements Web3jWrapper {

    @Override
    public BcosBlock.Block getBlockByNumber(long blockNumber) throws IOException {
        String blockJson =
                "{\"number\":331,\"hash\":\"0x6db416c8ac6b1fe7ed08771de419b71c084ee5969029346806324601f2e3f0d0\",\"parentHash\":\"0xed0ef6826277efbc9601dedc1b6ea20067eed219e415e1038f111155b8fc1e24\",\"nonce\":0,\"sha3Uncles\":null,\"logsBloom\":\"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"transactionsRoot\":\"0x07009a9d655cee91e95dcd1c53d5917a58f80e6e6ac689bae24bd911d75c471c\",\"stateRoot\":\"0xce8a92c9311e9e0b77842c86adf8fcf91cbab8fb5daefc85b21f501ca8b1f682\",\"receiptsRoot\":\"0x2a4433b7611c4b1fae16b873ced1dec9a65b82416e448f58fded002c05a10082\",\"author\":null,\"sealer\":\"0x1\",\"mixHash\":null,\"extraData\":[],\"gasLimit\":0,\"gasUsed\":0,\"timestamp\":1584081463141,\"transactions\":[{\"blockHash\":\"0xd9e9241be0853aacc88b1ff921eb598af0080a100514e192e9a449f577b3a2ef\",\"blockNumber\":\"0x9\",\"from\":\"0x35039a08bd5aa848fe9ce1c49bf1e3c2ba640434\",\"gas\":\"0x11e1a300\",\"gasPrice\":\"0x11e1a300\",\"hash\":\"0x8b3946912d1133f9fb0722a7b607db2456d468386c2e86b035e81ef91d94eb90\",\"input\":\"0x4ed3885e000000000000000000000000000000000000000000000000000000000000002000000000000000000000000000000000000000000000000000000000000000016100000000000000000000000000000000000000000000000000000000000000\",\"nonce\":\"0x242c9a986cbe196f6b02e65de5c6caf85d5ba9ec86dd6d46dd1a1555b48c97b\",\"to\":\"0x7ba8711a62d7e1377988efff0cb9de45c6353169\",\"transactionIndex\":\"0x0\",\"value\":\"0x0\"}],\"uncles\":null,\"sealerList\":[\"7f6b1fc98c6bc8dbde4afe62bf1322a4f10ff29528f1e6bb0e57590aa81c31bfe57510787c5adf3fb90fb4239d5483c0d805874451aeb7e76c6c15e1b2123165\",\"9b04ba34f30452a43e7868e1b918c380f1d3d3bdc98d752d1dc30155e6a3dd9da6e530a4351eb4eab42f8703a3922233b830f2678c14179e3ac0f9e5bef8c954\",\"f4c43730a29511e66e9eddbee7024a65d8a8b3b886e6f652785faefb979676f04bd9671529aef9147c86edf58df0482b4e5b293006a179b14039484c6d20a18e\"],\"numberRaw\":\"0x14b\",\"nonceRaw\":null,\"gasLimitRaw\":\"0x0\",\"gasUsedRaw\":\"0x0\",\"timestampRaw\":\"0x170d29ce765\"}";
        ObjectMapper objectMapper = ObjectMapperFactory.getObjectMapper();
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        return objectMapper.readValue(blockJson, BcosBlock.Block.class);
    }

    @Override
    public BigInteger getBlockNumber() throws IOException {
        return BigInteger.valueOf(11111);
    }

    @Override
    public BcosBlockHeader.BlockHeader getBlockHeaderByNumber(long blockNumber) throws IOException {
        String headerJson =
                "{\"dbHash\": \"0x0000000000000000000000000000000000000000000000000000000000000000\",\"extraData\": [],\"gasLimit\": \"0x0\",\"gasUsed\": \"0x0\",\"hash\": \"0x99576e7567d258bd6426ddaf953ec0c953778b2f09a078423103c6555aa4362d\",\"logsBloom\": \"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"number\": 1,\"parentHash\": \"0x64ba7bf5c6b5a83854774475bf8511d5e9bb38d8a962a859b52aa9c9fba0c685\",\"receiptsRoot\": \"0x049389563053748a0fd2b256260b9e8c76a427b543bee18f3a221d80d1553da8\",\"sealer\": \"0x2\",\"sealerList\": [\"11e1be251ca08bb44f36fdeedfaeca40894ff80dfd80084607a75509edeaf2a9c6fee914f1e9efda571611cf4575a1577957edfd2baa9386bd63eb034868625f\",\"78a313b426c3de3267d72b53c044fa9fe70c2a27a00af7fea4a549a7d65210ed90512fc92b6194c14766366d434235c794289d66deff0796f15228e0e14a9191\",\"95b7ff064f91de76598f90bc059bec1834f0d9eeb0d05e1086d49af1f9c2f321062d011ee8b0df7644bd54c4f9ca3d8515a3129bbb9d0df8287c9fa69552887e\",\"b8acb51b9fe84f88d670646be36f31c52e67544ce56faf3dc8ea4cf1b0ebff0864c6b218fdcd9cf9891ebd414a995847911bd26a770f429300085f37e1131f36\"],\"signatureList\": [{\"index\": \"0x2\",\"signature\": \"0xae098aabc63a53b8dcb57da9a87f13aebf231bfe1704da88f125cee6b4b30ee0609d0720a97bed1900b96bc3e7a63584158340b5b7f802945241f61731f9358900\"}, { \"index\": \"0x0\", \"signature\": \"0x411cb93f816549eba82c3bf8c03fa637036dcdee65667b541d0da06a6eaea80d16e6ca52bf1b08f77b59a834bffbc124c492ea7a1601d0c4fb257d97dc97cea600\"},{\"index\": \"0x3\",\"signature\": \"0xb5b41e49c0b2bf758322ecb5c86dc3a3a0f9b98891b5bbf50c8613a241f05f595ce40d0bb212b6faa32e98546754835b057b9be0b29b9d0c8ae8b38f7487b8d001\"} ], \"stateRoot\": \"0x0000000000000000000000000000000000000000000000000000000000000000\",\"timestamp\": \"0x173ad8703d6\",\"transactionsRoot\": \"0xb563f70188512a085b5607cac0c35480336a566de736c83410a062c9acc785ad\"}";
        ObjectMapper objectMapper = ObjectMapperFactory.getObjectMapper();
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        return objectMapper.readValue(headerJson, BcosBlockHeader.BlockHeader.class);
    }

    @Override
    public void sendTransactionAndGetProof(
            String signedTransactionData, TransactionSucCallback callback) throws IOException {
        String str =
                "{\"blockHash\":\"0xd9e9241be0853aacc88b1ff921eb598af0080a100514e192e9a449f577b3a2ef\",\"blockNumber\":\"0x9\",\"contractAddress\":\"0x0000000000000000000000000000000000000000\",\"from\":\"0x35039a08bd5aa848fe9ce1c49bf1e3c2ba640434\",\"gasUsed\":\"0x802c\",\"input\":\"0x4ed3885e000000000000000000000000000000000000000000000000000000000000002000000000000000000000000000000000000000000000000000000000000000016100000000000000000000000000000000000000000000000000000000000000\",\"logs\":[],\"logsBloom\":\"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"output\":\"0x\",\"root\":\"0x70e6fa150a77f34c71ad9e9923734a740e0bd0a3eeb3cf9a804c43e6012b16bd\",\"status\":\"0x0\",\"to\":\"0x7ba8711a62d7e1377988efff0cb9de45c6353169\",\"transactionHash\":\"0x8b3946912d1133f9fb0722a7b607db2456d468386c2e86b035e81ef91d94eb90\",\"transactionIndex\":\"0x0\",\"receiptProof\":[{\"left\":[],\"right\":[]}],\"txProof\":[{\"left\":[],\"right\":[]}]}";
        ObjectMapper objectMapper = ObjectMapperFactory.getObjectMapper();
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        TransactionReceipt transactionReceipt =
                objectMapper.readValue(str, TransactionReceipt.class);
        callback.onResponse(transactionReceipt);
    }

    @Override
    public TransactionReceiptWithProof.ReceiptAndProof getTransactionReceiptByHashWithProof(
            String transactionHash) throws IOException {

        String blockJson =
                "{\"dbHash\":\"0x70e6fa150a77f34c71ad9e9923734a740e0bd0a3eeb3cf9a804c43e6012b16bd\",\"extraData\":[],\"gasLimit\":\"0x0\",\"gasUsed\":\"0x0\",\"hash\":\"0xd9e9241be0853aacc88b1ff921eb598af0080a100514e192e9a449f577b3a2ef\",\"logsBloom\":\"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"number\":\"0x9\",\"parentHash\":\"0x4ee40e592d4f7243faba04d69d6c8e158c1e2663398484d83bf27827bdbb3117\",\"receiptsRoot\":\"0xe6caae405e8ae50737cd7a39c9d1cba83335594bf180af40538c970b87ae7bf8\",\"sealer\":\"0x1\",\"sealerList\":[\"2ddbc04bea0d57eeb09c2828e3eeca6e392f5d25515210eb4f338aae49233a0fdfcb5f7f6229830729a42c518118645a0e936f353e2795d966494fd494af124d\",\"8d08802246badaa9bf3eed5ba56d6c4b6811dbc0c22dd3aa17ddc566e38470a1fd078eab763c6546f7946e71279c1e466540433ac6b1463f6a60dcd85d2b7004\",\"924d8a3da3ec715a7dda5f860c53e1d1706bc6c7033e18cfa0a093ec07114fda05236a9951dc6fd88baaa1af80490627beb7db826072ee49dca9335190414428\",\"a53da8b4819cd99afac393b961078bd680eb28311d941e5f051b82ebaf6e916c51655dbf6237aa2598d7a364e8714343b1d28109de98f2c7dcdcda60621651c9\"],\"stateRoot\":\"0x70e6fa150a77f34c71ad9e9923734a740e0bd0a3eeb3cf9a804c43e6012b16bd\",\"timestamp\":\"0x17152c9a056\",\"transactions\":[\"0x8b3946912d1133f9fb0722a7b607db2456d468386c2e86b035e81ef91d94eb90\"],\"transactionsRoot\":\"0x1c816600c113c0639c88ea96d269645bb52fe5a73f64e3496864d2ad2ceec6c0\"}";
        String transactionAndProofJson =
                "{\"transaction\":{\"blockHash\":\"0xd9e9241be0853aacc88b1ff921eb598af0080a100514e192e9a449f577b3a2ef\",\"blockNumber\":\"0x9\",\"from\":\"0x35039a08bd5aa848fe9ce1c49bf1e3c2ba640434\",\"gas\":\"0x11e1a300\",\"gasPrice\":\"0x11e1a300\",\"hash\":\"0x8b3946912d1133f9fb0722a7b607db2456d468386c2e86b035e81ef91d94eb90\",\"input\":\"0x4ed3885e000000000000000000000000000000000000000000000000000000000000002000000000000000000000000000000000000000000000000000000000000000016100000000000000000000000000000000000000000000000000000000000000\",\"nonce\":\"0x242c9a986cbe196f6b02e65de5c6caf85d5ba9ec86dd6d46dd1a1555b48c97b\",\"to\":\"0x7ba8711a62d7e1377988efff0cb9de45c6353169\",\"transactionIndex\":\"0x0\",\"value\":\"0x0\"},\"txProof\":[{\"left\":[],\"right\":[]}]}";
        String transactionReceiptAndProofJson =
                "{\"receiptProof\":[{\"left\":[],\"right\":[]}],\"transactionReceipt\":{\"blockHash\":\"0xd9e9241be0853aacc88b1ff921eb598af0080a100514e192e9a449f577b3a2ef\",\"blockNumber\":\"0x9\",\"contractAddress\":\"0x0000000000000000000000000000000000000000\",\"from\":\"0x35039a08bd5aa848fe9ce1c49bf1e3c2ba640434\",\"gasUsed\":\"0x802c\",\"input\":\"0x4ed3885e000000000000000000000000000000000000000000000000000000000000002000000000000000000000000000000000000000000000000000000000000000016100000000000000000000000000000000000000000000000000000000000000\",\"logs\":[],\"logsBloom\":\"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"output\":\"0x\",\"root\":\"0x70e6fa150a77f34c71ad9e9923734a740e0bd0a3eeb3cf9a804c43e6012b16bd\",\"status\":\"0x0\",\"to\":\"0x7ba8711a62d7e1377988efff0cb9de45c6353169\",\"transactionHash\":\"0x8b3946912d1133f9fb0722a7b607db2456d468386c2e86b035e81ef91d94eb90\",\"transactionIndex\":\"0x0\"}}";

        String blockJson0 =
                "{\"dbHash\":\"0x9abce0e65719f06ee104abf1539e42beef25c164f889420eab9c055cc95de03c\",\"extraData\":[],\"gasLimit\":\"0x0\",\"gasUsed\":\"0x0\",\"hash\":\"0x83eab142175649d0bc5a93bda004d02f165cd5aaf10ec988e72d8873b8c6de95\",\"logsBloom\":\"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"number\":\"0x23\",\"parentHash\":\"0x92f0701a02f47cf53f9906a5808ab2ff368aa81dcd22c942cad4567ce0ffb3c1\",\"receiptsRoot\":\"0x57da96f64cd53b6223fa82a2e499075b20bf45947824cea35ac8345b1d8069d8\",\"sealer\":\"0x2\",\"sealerList\":[\"2ddbc04bea0d57eeb09c2828e3eeca6e392f5d25515210eb4f338aae49233a0fdfcb5f7f6229830729a42c518118645a0e936f353e2795d966494fd494af124d\",\"8d08802246badaa9bf3eed5ba56d6c4b6811dbc0c22dd3aa17ddc566e38470a1fd078eab763c6546f7946e71279c1e466540433ac6b1463f6a60dcd85d2b7004\",\"924d8a3da3ec715a7dda5f860c53e1d1706bc6c7033e18cfa0a093ec07114fda05236a9951dc6fd88baaa1af80490627beb7db826072ee49dca9335190414428\",\"a53da8b4819cd99afac393b961078bd680eb28311d941e5f051b82ebaf6e916c51655dbf6237aa2598d7a364e8714343b1d28109de98f2c7dcdcda60621651c9\"],\"stateRoot\":\"0x9abce0e65719f06ee104abf1539e42beef25c164f889420eab9c055cc95de03c\",\"timestamp\":\"0x1715335555f\",\"transactions\":[\"0xf76341248f90e743618a8152fb10f851af4ddf8ac297137d6668214f58334dc7\",\"0x4389024348c8f4adf2b0ce54e76f057ca786fbc0198a4ba10b4a19d674171152\",\"0x633a3386a189455354c058af6606d705697f3b216ad555958dc680f68cc4e99d\",\"0x483197261994b1267b2f2ff2ab48fcd8981b0ef7a9ccb9def497ae11ac29d1c0\",\"0xab700e2e0a079e19fa4442e7d4e18a59fddeb2efaa225d4df5b12a80d59c4ae3\"],\"transactionsRoot\":\"0x215ba810f73d5efd87e0e77936cdca4bf8bb37fbd5b4c00cefa73d3d762d4a41\"}";
        String transactionAndProofJson0 =
                "{\"transaction\":{\"blockHash\":\"0x83eab142175649d0bc5a93bda004d02f165cd5aaf10ec988e72d8873b8c6de95\",\"blockNumber\":\"0x23\",\"from\":\"0x65d168d7499e72d45ed02de1c05a5197448612c6\",\"gas\":\"0x1c9c380\",\"gasPrice\":\"0x1c9c380\",\"hash\":\"0x633a3386a189455354c058af6606d705697f3b216ad555958dc680f68cc4e99d\",\"input\":\"0x3fe8e3f50000000000000000000000000000000000000000000000000000000000000040000000000000000000000000000000000000000000000000000000003b9aca00000000000000000000000000000000000000000000000000000000000000000a3565386331356434323200000000000000000000000000000000000000000000\",\"nonce\":\"0x1d9bdf6d0f5b9caa568734f2eeab6fd19dfa6545a83b8313c33db9b3f690856\",\"to\":\"0x0000000000000000000000000000000000005002\",\"transactionIndex\":\"0x2\",\"value\":\"0x0\"},\"txProof\":[{\"left\":[\"80f76341248f90e743618a8152fb10f851af4ddf8ac297137d6668214f58334dc7\",\"014389024348c8f4adf2b0ce54e76f057ca786fbc0198a4ba10b4a19d674171152\"],\"right\":[\"03483197261994b1267b2f2ff2ab48fcd8981b0ef7a9ccb9def497ae11ac29d1c0\",\"04ab700e2e0a079e19fa4442e7d4e18a59fddeb2efaa225d4df5b12a80d59c4ae3\"]},{\"left\":[],\"right\":[]}]}";

        String transactionReceiptAndProofJson0 =
                "{\"receiptProof\":[{\"left\":[\"803fb462c75987b2001a83dbed279aeecec047b1f9bc9c56e195a74932fbaae0b1\",\"01e9fe05b4c30ed7eb927e24b788016114c1c31bf3771181c4d83bb3416c04ba09\"],\"right\":[\"03495a1e82c707f19aa55f2135b1dfddf992f39f6a614a910e001b9c00685e66d5\",\"04cf051dd6960c184742948ee3f10883c3bf11f51da6ed6c67eacd37972338ebde\"]},{\"left\":[],\"right\":[]}],\"transactionReceipt\":{\"blockHash\":\"0x83eab142175649d0bc5a93bda004d02f165cd5aaf10ec988e72d8873b8c6de95\",\"blockNumber\":\"0x23\",\"contractAddress\":\"0x0000000000000000000000000000000000000000\",\"from\":\"0x65d168d7499e72d45ed02de1c05a5197448612c6\",\"gasUsed\":\"0x10a88\",\"input\":\"0x3fe8e3f50000000000000000000000000000000000000000000000000000000000000040000000000000000000000000000000000000000000000000000000003b9aca00000000000000000000000000000000000000000000000000000000000000000a3565386331356434323200000000000000000000000000000000000000000000\",\"logs\":[],\"logsBloom\":\"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"output\":\"0x0000000000000000000000000000000000000000000000000000000000000000\",\"root\":\"0x9abce0e65719f06ee104abf1539e42beef25c164f889420eab9c055cc95de03c\",\"status\":\"0x0\",\"to\":\"0x0000000000000000000000000000000000005002\",\"transactionHash\":\"0x633a3386a189455354c058af6606d705697f3b216ad555958dc680f68cc4e99d\",\"transactionIndex\":\"0x2\"}}";

        BcosBlock.Block block0 =
                ObjectMapperFactory.getObjectMapper().readValue(blockJson0, BcosBlock.Block.class);
        TransactionWithProof.TransAndProof transAndProof0 =
                ObjectMapperFactory.getObjectMapper()
                        .readValue(
                                transactionAndProofJson0, TransactionWithProof.TransAndProof.class);
        TransactionReceiptWithProof.ReceiptAndProof receiptAndProof0 =
                ObjectMapperFactory.getObjectMapper()
                        .readValue(
                                transactionReceiptAndProofJson0,
                                TransactionReceiptWithProof.ReceiptAndProof.class);

        return receiptAndProof0;
    }

    @Override
    public TransactionWithProof.TransAndProof getTransactionByHashWithProof(String transactionHash)
            throws IOException {
        String blockJson =
                "{\"dbHash\":\"0x70e6fa150a77f34c71ad9e9923734a740e0bd0a3eeb3cf9a804c43e6012b16bd\",\"extraData\":[],\"gasLimit\":\"0x0\",\"gasUsed\":\"0x0\",\"hash\":\"0xd9e9241be0853aacc88b1ff921eb598af0080a100514e192e9a449f577b3a2ef\",\"logsBloom\":\"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"number\":\"0x9\",\"parentHash\":\"0x4ee40e592d4f7243faba04d69d6c8e158c1e2663398484d83bf27827bdbb3117\",\"receiptsRoot\":\"0xe6caae405e8ae50737cd7a39c9d1cba83335594bf180af40538c970b87ae7bf8\",\"sealer\":\"0x1\",\"sealerList\":[\"2ddbc04bea0d57eeb09c2828e3eeca6e392f5d25515210eb4f338aae49233a0fdfcb5f7f6229830729a42c518118645a0e936f353e2795d966494fd494af124d\",\"8d08802246badaa9bf3eed5ba56d6c4b6811dbc0c22dd3aa17ddc566e38470a1fd078eab763c6546f7946e71279c1e466540433ac6b1463f6a60dcd85d2b7004\",\"924d8a3da3ec715a7dda5f860c53e1d1706bc6c7033e18cfa0a093ec07114fda05236a9951dc6fd88baaa1af80490627beb7db826072ee49dca9335190414428\",\"a53da8b4819cd99afac393b961078bd680eb28311d941e5f051b82ebaf6e916c51655dbf6237aa2598d7a364e8714343b1d28109de98f2c7dcdcda60621651c9\"],\"stateRoot\":\"0x70e6fa150a77f34c71ad9e9923734a740e0bd0a3eeb3cf9a804c43e6012b16bd\",\"timestamp\":\"0x17152c9a056\",\"transactions\":[\"0x8b3946912d1133f9fb0722a7b607db2456d468386c2e86b035e81ef91d94eb90\"],\"transactionsRoot\":\"0x1c816600c113c0639c88ea96d269645bb52fe5a73f64e3496864d2ad2ceec6c0\"}";
        String transactionAndProofJson =
                "{\"transaction\":{\"blockHash\":\"0xd9e9241be0853aacc88b1ff921eb598af0080a100514e192e9a449f577b3a2ef\",\"blockNumber\":\"0x9\",\"from\":\"0x35039a08bd5aa848fe9ce1c49bf1e3c2ba640434\",\"gas\":\"0x11e1a300\",\"gasPrice\":\"0x11e1a300\",\"hash\":\"0x8b3946912d1133f9fb0722a7b607db2456d468386c2e86b035e81ef91d94eb90\",\"input\":\"0x4ed3885e000000000000000000000000000000000000000000000000000000000000002000000000000000000000000000000000000000000000000000000000000000016100000000000000000000000000000000000000000000000000000000000000\",\"nonce\":\"0x242c9a986cbe196f6b02e65de5c6caf85d5ba9ec86dd6d46dd1a1555b48c97b\",\"to\":\"0x7ba8711a62d7e1377988efff0cb9de45c6353169\",\"transactionIndex\":\"0x0\",\"value\":\"0x0\"},\"txProof\":[{\"left\":[],\"right\":[]}]}";
        String transactionReceiptAndProofJson =
                "{\"receiptProof\":[{\"left\":[],\"right\":[]}],\"transactionReceipt\":{\"blockHash\":\"0xd9e9241be0853aacc88b1ff921eb598af0080a100514e192e9a449f577b3a2ef\",\"blockNumber\":\"0x9\",\"contractAddress\":\"0x0000000000000000000000000000000000000000\",\"from\":\"0x35039a08bd5aa848fe9ce1c49bf1e3c2ba640434\",\"gasUsed\":\"0x802c\",\"input\":\"0x4ed3885e000000000000000000000000000000000000000000000000000000000000002000000000000000000000000000000000000000000000000000000000000000016100000000000000000000000000000000000000000000000000000000000000\",\"logs\":[],\"logsBloom\":\"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"output\":\"0x\",\"root\":\"0x70e6fa150a77f34c71ad9e9923734a740e0bd0a3eeb3cf9a804c43e6012b16bd\",\"status\":\"0x0\",\"to\":\"0x7ba8711a62d7e1377988efff0cb9de45c6353169\",\"transactionHash\":\"0x8b3946912d1133f9fb0722a7b607db2456d468386c2e86b035e81ef91d94eb90\",\"transactionIndex\":\"0x0\"}}";

        String blockJson0 =
                "{\"dbHash\":\"0x9abce0e65719f06ee104abf1539e42beef25c164f889420eab9c055cc95de03c\",\"extraData\":[],\"gasLimit\":\"0x0\",\"gasUsed\":\"0x0\",\"hash\":\"0x83eab142175649d0bc5a93bda004d02f165cd5aaf10ec988e72d8873b8c6de95\",\"logsBloom\":\"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"number\":\"0x23\",\"parentHash\":\"0x92f0701a02f47cf53f9906a5808ab2ff368aa81dcd22c942cad4567ce0ffb3c1\",\"receiptsRoot\":\"0x57da96f64cd53b6223fa82a2e499075b20bf45947824cea35ac8345b1d8069d8\",\"sealer\":\"0x2\",\"sealerList\":[\"2ddbc04bea0d57eeb09c2828e3eeca6e392f5d25515210eb4f338aae49233a0fdfcb5f7f6229830729a42c518118645a0e936f353e2795d966494fd494af124d\",\"8d08802246badaa9bf3eed5ba56d6c4b6811dbc0c22dd3aa17ddc566e38470a1fd078eab763c6546f7946e71279c1e466540433ac6b1463f6a60dcd85d2b7004\",\"924d8a3da3ec715a7dda5f860c53e1d1706bc6c7033e18cfa0a093ec07114fda05236a9951dc6fd88baaa1af80490627beb7db826072ee49dca9335190414428\",\"a53da8b4819cd99afac393b961078bd680eb28311d941e5f051b82ebaf6e916c51655dbf6237aa2598d7a364e8714343b1d28109de98f2c7dcdcda60621651c9\"],\"stateRoot\":\"0x9abce0e65719f06ee104abf1539e42beef25c164f889420eab9c055cc95de03c\",\"timestamp\":\"0x1715335555f\",\"transactions\":[\"0xf76341248f90e743618a8152fb10f851af4ddf8ac297137d6668214f58334dc7\",\"0x4389024348c8f4adf2b0ce54e76f057ca786fbc0198a4ba10b4a19d674171152\",\"0x633a3386a189455354c058af6606d705697f3b216ad555958dc680f68cc4e99d\",\"0x483197261994b1267b2f2ff2ab48fcd8981b0ef7a9ccb9def497ae11ac29d1c0\",\"0xab700e2e0a079e19fa4442e7d4e18a59fddeb2efaa225d4df5b12a80d59c4ae3\"],\"transactionsRoot\":\"0x215ba810f73d5efd87e0e77936cdca4bf8bb37fbd5b4c00cefa73d3d762d4a41\"}";
        String transactionAndProofJson0 =
                "{\"transaction\":{\"blockHash\":\"0x83eab142175649d0bc5a93bda004d02f165cd5aaf10ec988e72d8873b8c6de95\",\"blockNumber\":\"0x23\",\"from\":\"0x65d168d7499e72d45ed02de1c05a5197448612c6\",\"gas\":\"0x1c9c380\",\"gasPrice\":\"0x1c9c380\",\"hash\":\"0x633a3386a189455354c058af6606d705697f3b216ad555958dc680f68cc4e99d\",\"input\":\"0x3fe8e3f50000000000000000000000000000000000000000000000000000000000000040000000000000000000000000000000000000000000000000000000003b9aca00000000000000000000000000000000000000000000000000000000000000000a3565386331356434323200000000000000000000000000000000000000000000\",\"nonce\":\"0x1d9bdf6d0f5b9caa568734f2eeab6fd19dfa6545a83b8313c33db9b3f690856\",\"to\":\"0x0000000000000000000000000000000000005002\",\"transactionIndex\":\"0x2\",\"value\":\"0x0\"},\"txProof\":[{\"left\":[\"80f76341248f90e743618a8152fb10f851af4ddf8ac297137d6668214f58334dc7\",\"014389024348c8f4adf2b0ce54e76f057ca786fbc0198a4ba10b4a19d674171152\"],\"right\":[\"03483197261994b1267b2f2ff2ab48fcd8981b0ef7a9ccb9def497ae11ac29d1c0\",\"04ab700e2e0a079e19fa4442e7d4e18a59fddeb2efaa225d4df5b12a80d59c4ae3\"]},{\"left\":[],\"right\":[]}]}";

        String transactionReceiptAndProofJson0 =
                "{\"receiptProof\":[{\"left\":[\"803fb462c75987b2001a83dbed279aeecec047b1f9bc9c56e195a74932fbaae0b1\",\"01e9fe05b4c30ed7eb927e24b788016114c1c31bf3771181c4d83bb3416c04ba09\"],\"right\":[\"03495a1e82c707f19aa55f2135b1dfddf992f39f6a614a910e001b9c00685e66d5\",\"04cf051dd6960c184742948ee3f10883c3bf11f51da6ed6c67eacd37972338ebde\"]},{\"left\":[],\"right\":[]}],\"transactionReceipt\":{\"blockHash\":\"0x83eab142175649d0bc5a93bda004d02f165cd5aaf10ec988e72d8873b8c6de95\",\"blockNumber\":\"0x23\",\"contractAddress\":\"0x0000000000000000000000000000000000000000\",\"from\":\"0x65d168d7499e72d45ed02de1c05a5197448612c6\",\"gasUsed\":\"0x10a88\",\"input\":\"0x3fe8e3f50000000000000000000000000000000000000000000000000000000000000040000000000000000000000000000000000000000000000000000000003b9aca00000000000000000000000000000000000000000000000000000000000000000a3565386331356434323200000000000000000000000000000000000000000000\",\"logs\":[],\"logsBloom\":\"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\",\"output\":\"0x0000000000000000000000000000000000000000000000000000000000000000\",\"root\":\"0x9abce0e65719f06ee104abf1539e42beef25c164f889420eab9c055cc95de03c\",\"status\":\"0x0\",\"to\":\"0x0000000000000000000000000000000000005002\",\"transactionHash\":\"0x633a3386a189455354c058af6606d705697f3b216ad555958dc680f68cc4e99d\",\"transactionIndex\":\"0x2\"}}";

        BcosBlock.Block block0 =
                ObjectMapperFactory.getObjectMapper().readValue(blockJson0, BcosBlock.Block.class);
        TransactionWithProof.TransAndProof transAndProof0 =
                ObjectMapperFactory.getObjectMapper()
                        .readValue(
                                transactionAndProofJson0, TransactionWithProof.TransAndProof.class);
        TransactionReceiptWithProof.ReceiptAndProof receiptAndProof0 =
                ObjectMapperFactory.getObjectMapper()
                        .readValue(
                                transactionReceiptAndProofJson0,
                                TransactionReceiptWithProof.ReceiptAndProof.class);
        return transAndProof0;
    }

    @Override
    public Call.CallOutput call(String accountAddress, String contractAddress, String data)
            throws IOException {
        Call.CallOutput callOutput = new Call.CallOutput();
        callOutput.setCurrentBlockNumber("0x1111");
        callOutput.setStatus("0x0");
        callOutput.setOutput(data.substring(10));
        return callOutput;
    }

    @Override
    public Web3j getWeb3j() {
        return new MockWeb3j();
    }
}
