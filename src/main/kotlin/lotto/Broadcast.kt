package lotto

class Broadcast {
    fun printLottoQuantity(count: Int) {
        println("\n$count$PURCHASE_LOTTO_COUNT_MESSAGE")
    }

    fun printInputPaymentMassage() {
        println(PURCHASE_PAYMENT_MESSAGE)
    }

    companion object {
        const val PURCHASE_PAYMENT_MESSAGE = "구입금액을 입력해 주세요."
        const val PURCHASE_LOTTO_COUNT_MESSAGE = "개를 구매했습니다."
    }
}