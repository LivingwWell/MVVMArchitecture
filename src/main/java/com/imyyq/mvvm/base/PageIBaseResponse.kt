package com.imyyq.mvvm.base

/***
 *创建时间: 2021/11/26
 *创建人: lee
 *功能描述:
 */
interface PageIBaseResponse <T> {
    fun code(): Int?
    fun msg(): String?
    fun data(): MutableList<T>?
    fun pages(): Int
    fun total(): Int
    fun index(): Int
}