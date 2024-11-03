package lotto

class Broadcast {
    fun printInputPaymentMassage() {
        println(PURCHASE_PAYMENT_MESSAGE)
    }

    fun printLottoNumbers(purchaseLotto: List<Lotto>) {
        printLottoQuantity(purchaseLotto.size)
        purchaseLotto.forEach {
            println(it.getLottoNumbers())
        }
    }

    private fun printLottoQuantity(count: Int) {
        println("\n$count$PURCHASE_LOTTO_COUNT_MESSAGE")
    }

    fun printWinningNumberMessage() {
        println("\n$WINNING_NUMBER_MESSAGE")
    }

    companion object {
        const val PURCHASE_PAYMENT_MESSAGE = "구입금액을 입력해 주세요."
        const val PURCHASE_LOTTO_COUNT_MESSAGE = "개를 구매했습니다."
        const val WINNING_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요."
    }
}