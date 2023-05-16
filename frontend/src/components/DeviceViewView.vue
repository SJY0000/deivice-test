<template>

    <v-data-table
        :headers="headers"
        :items="deviceView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DeviceViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            deviceView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/deviceViews'))

            temp.data._embedded.deviceViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.deviceView = temp.data._embedded.deviceViews;
        },
        methods: {
        }
    }
</script>

