<template>
<div id="orders">
    <button class="back_botton" @click="back()">back</button>

    <!-- This section shows all orders with product list to the owner -->
    <h3 style="text-align:center; margin-top:50px; margin-left:50px">All Orders</h3>
    <table class="tableStyle">
        <tr>
            <th>Date</th>
            <th>total</th>
            <th>TransactionID</th>
            <th>Products List</th>
            <th>Fulfilled/Completed</th>
        </tr>
        <tr v-for="order in orders" :key=order.orderDate>
            <td>{{ order.orderDate }}</td>
            <td>{{ order.total }}</td>
            <td>{{ order.payment }}</td>
            <td>
                <p v-for="items in order.cart.cartItems" :key=items.quantity>
                    {{ items.product.productName}} with quantity: {{ items.quantity}}
                </p>
            </td>
            <td style="text-align: center">
                {{ order.completed }}
            </td>
        </tr>
    </table>
    <span v-if="errorOrder.length > 0" class="error_message">Error: {{errorOrder}} </span>


    <!-- This section shows all instore purchase to the owner -->
    <h3 style="text-align:center; margin-top:50px; margin-left:50px">All In-Store Purchase</h3>
    <table class="tableStyle">
        <tr>
            <th>Date</th>
            <th>total</th>
            <th>Products List</th>
        </tr>
        <tr v-for="isp in instorePurchases" :key=isp.total>
            <td>{{ isp.purchaseDate }}</td>
            <td>{{ isp.total }}</td>
            <td>
                <p v-for="item in isp.cartItems" :key=item.quantity>
                    {{ item.product.productName}} with quantity: {{ item.quantity}}
                </p>
            </td>
        </tr>
    </table>
    <span v-if="errorInstorePurchases.length > 0" class="error_message">Error: {{errorInstorePurchases}} </span>
</div>
</template>

<style>
#orders {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    color: #2c3e50;
    background: white;
}

.back_botton {
    margin-top: 5px;
    margin-right: 5px;
    width: 70px;
    top: 0;
    right: 0;
    position: absolute;
}

.tableStyle,
th,
td {
    border: 1px solid black;
    border-collapse: collapse;
    text-align: center;
    text-align: center;
    padding: 10px;
}

.tableStyle {
    width: 60%;
    margin-left: auto;
    margin-right: auto;
    caption-side: top;
}

.error_message {
    color: red;
    text-align: center;
}
</style>

<script src="./scripts/orders.js"></script>
