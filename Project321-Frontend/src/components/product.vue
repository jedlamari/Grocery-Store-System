<template>
<div id="product">

    <!-- This section show customer all products in store beside the products that is out of stock -->
    <button class="back_botton" @click="back()">back</button>
    <h3 style="text-align:center; margin-right:30%">All Products</h3>
    <div class="search-wrapper panel-heading col-sm-12">
        <input type="text" v-model="search" placeholder="Search" style="margin-right:30%" /> <br> <br>
    </div>
    <table class="product">
        <thead>
            <tr>
                <th>product name</th>
                <th>preview</th>
                <th>price type</th>
                <th>Online availability</th>
                <th>stock</th>
                <th>price</th>
                <th>add to cart</th>
            </tr>
        </thead>
        <tbody>
            <tr v-for="(product, i) in ProductFilter" :key=product.productName>
                <td>{{ product.productName }} </td>
                <td>
                    <img :src="'static/' + product.productName + '.jpg'" alt="N/A" style="width:70px;height:70px;" class="bigpic">
                </td>
                <td>{{ product.priceType }}</td>
                <td>{{ product.isAvailableOnline }}</td>
                <td>{{ product.stock }}</td>
                <td>{{ product.price }}</td>
                <td>
                    <p v-if="product.isAvailableOnline === 'no'" class="error_message">Not availableOnline</p>
                    <input v-if="product.isAvailableOnline === 'yes'" type="number" id="tentacles" name="tentacles" min="0" :max="product.stock" v-model="newQuantity[i]">

                    <button v-bind:disabled="newQuantity[i]<1 || newQuantity.length<i+1 || !newQuantity[i] || product.stock < newQuantity[i]" @click="toCart(product.productName, newQuantity[i])">Add</button>
                </td>
            </tr>
        </tbody>
    </table>


    <!-- This table provides a preview for the cart items -->
    <p>Your cart preview</p>
    <table id="lists">
        <tr>
            <th> product name </th>
            <th> quantity </th>
        </tr>
        <tr v-for="cartItem in items" :key=cartItem.name>
            <td> {{cartItem.product.productName}} </td>
            <td> {{cartItem.quantity}} </td>
        </tr>
    </table>
    <span v-if="this.errorProduct.length > 0" class="error_message">Error: {{errorStatus}} </span>

</div>
</template>

<style>
#product {
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

.product,
th,
td {
    border: 1px solid black;
    border-collapse: collapse;
    text-align: center;
    text-align: center;
    padding: 10px;
}

.product {
    float: left;
    width: 70%;
    margin-left: 5%;
    caption-side: top;
}

.error_message {
    color: red;
    text-align: center;
}

table td:hover img {
    transform: scale(2.0);
    transition: transform .3s;
}

#lists {
    background: #d5e2f0;
    float: right;
    width: 15%;
    margin-right: 5%;
}
</style>

<script src="./scripts/product.js"></script>
