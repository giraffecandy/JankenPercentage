package app.babachan.janken

import io.realm.RealmObject

open class Janken (
    open var cpu: String = "",
    open var yours: String = "",
    open var result: String = "",
    open var winNumber: Int = 0,
    open var number: Int = 0
) : RealmObject()
