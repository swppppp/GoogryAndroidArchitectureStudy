package study.architecture.presentation.coinjob.adapter

import study.architecture.data.entity.ProcessingTicker

interface CoinAdapterContract {
    interface View {
        fun updateList(list: List<ProcessingTicker>)
        fun clearList()
    }

    interface Model {
        fun notifyDataChange()
    }

}