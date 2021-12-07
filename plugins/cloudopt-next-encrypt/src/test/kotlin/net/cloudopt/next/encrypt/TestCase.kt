package net.cloudopt.next.encrypt

import org.junit.Test

class TestCase {

    @Test
    fun testBase64() {
        val e = Base64Encrypt()
        val s = e.encrypt("hello")
        assert(e.decrypt(s) == "hello")
    }

    @Test
    fun testMD5() {
        val e = MD5Encrypt()
        val s = e.encrypt("hello")
        assert(s.length == 32)
    }

    @Test
    fun testAES() {
        val e = AesEncrypt("lKY7YO6jqRnzNOJ3")
        val s = e.encrypt("hello")
        assert(e.decrypt(s) == "hello")
    }

    @Test
    fun testRSA() {
        var e = RsaEncrypt()
        e.generate()
        var s = e.encrypt("hello")
        assert(e.decrypt(s) == "hello")

        e.generate(2048)
        s = e.encrypt("hello")
        assert(e.decrypt(s) == "hello")

        val publicKeyString = e.publicKeyString
        val privateKeyString = e.privateKeyString
        e = RsaEncrypt(publicKeyString, privateKeyString)
        s = e.encrypt("hello")
        assert(e.decrypt(s) == "hello")
    }

    @Test
    fun testDes() {
        val e = DesEncrypt("12345678")
        val s = e.encrypt("hello")
        assert(e.decrypt(s) == "hello")
    }

    @Test
    fun testSha1() {
        val e = SHA1Encrypt()
        val s = e.encrypt("hello")
        assert(s.length == 40)
    }

    @Test
    fun testSha() {
        val e = SHAEncrypt()
        val s = e.encrypt("hello")
        assert(s.length == 40)
    }

    @Test
    fun testSha256() {
        val e = SHA256Encrypt()
        val s = e.encrypt("hello")
        assert(s.length == 64)
    }
}
