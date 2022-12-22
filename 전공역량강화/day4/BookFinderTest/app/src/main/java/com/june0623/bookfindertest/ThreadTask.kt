package com.june0623.bookfindertest

abstract class ThreadTask<T1, T2> : Runnable {
    var argument: T1? = null
    var result: T2? = null

    fun execute(arg: T1) {
        argument = arg
        onPreExecute()
        val thread = Thread(this)
        thread.start()
        try {
            thread.join()
        } catch (e: InterruptedException) {
            e.printStackTrace()
            onPostExecute(null)
            return
        }
        onPostExecute(result)
    }

    override fun run() {
        result = doInBackground(argument)
    }

    protected abstract fun onPreExecute()
    protected abstract fun doInBackground(arg: T1?): T2
    protected abstract fun onPostExecute(result: T2?)
}
