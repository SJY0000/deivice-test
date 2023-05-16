
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DeviceManager from "./components/listers/DeviceCards"
import DeviceDetail from "./components/listers/DeviceDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/devices',
                name: 'DeviceManager',
                component: DeviceManager
            },
            {
                path: '/devices/:id',
                name: 'DeviceDetail',
                component: DeviceDetail
            },



    ]
})
