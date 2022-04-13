// Generated by view binder compiler. Do not edit!
package ca.mcgill.ecse321.project321.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ca.mcgill.ecse321.project321.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CartPageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView cart;

  @NonNull
  public final ListView cartItemsList;

  @NonNull
  public final TextView cartItemsTitle;

  @NonNull
  public final TextView cartTotalPrice;

  @NonNull
  public final TextView cartType;

  @NonNull
  public final Spinner cartTypeSpinner;

  @NonNull
  public final Button clearCartButton;

  @NonNull
  public final Button createCartButton;

  @NonNull
  public final Button deleteCartButton;

  private CartPageBinding(@NonNull LinearLayout rootView, @NonNull TextView cart,
      @NonNull ListView cartItemsList, @NonNull TextView cartItemsTitle,
      @NonNull TextView cartTotalPrice, @NonNull TextView cartType,
      @NonNull Spinner cartTypeSpinner, @NonNull Button clearCartButton,
      @NonNull Button createCartButton, @NonNull Button deleteCartButton) {
    this.rootView = rootView;
    this.cart = cart;
    this.cartItemsList = cartItemsList;
    this.cartItemsTitle = cartItemsTitle;
    this.cartTotalPrice = cartTotalPrice;
    this.cartType = cartType;
    this.cartTypeSpinner = cartTypeSpinner;
    this.clearCartButton = clearCartButton;
    this.createCartButton = createCartButton;
    this.deleteCartButton = deleteCartButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CartPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CartPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cart_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CartPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cart;
      TextView cart = ViewBindings.findChildViewById(rootView, id);
      if (cart == null) {
        break missingId;
      }

      id = R.id.cartItemsList;
      ListView cartItemsList = ViewBindings.findChildViewById(rootView, id);
      if (cartItemsList == null) {
        break missingId;
      }

      id = R.id.cart_items_title;
      TextView cartItemsTitle = ViewBindings.findChildViewById(rootView, id);
      if (cartItemsTitle == null) {
        break missingId;
      }

      id = R.id.cart_total_price;
      TextView cartTotalPrice = ViewBindings.findChildViewById(rootView, id);
      if (cartTotalPrice == null) {
        break missingId;
      }

      id = R.id.cartType;
      TextView cartType = ViewBindings.findChildViewById(rootView, id);
      if (cartType == null) {
        break missingId;
      }

      id = R.id.cartTypeSpinner;
      Spinner cartTypeSpinner = ViewBindings.findChildViewById(rootView, id);
      if (cartTypeSpinner == null) {
        break missingId;
      }

      id = R.id.clear_cart_button;
      Button clearCartButton = ViewBindings.findChildViewById(rootView, id);
      if (clearCartButton == null) {
        break missingId;
      }

      id = R.id.create_cart_button;
      Button createCartButton = ViewBindings.findChildViewById(rootView, id);
      if (createCartButton == null) {
        break missingId;
      }

      id = R.id.delete_cart_button;
      Button deleteCartButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteCartButton == null) {
        break missingId;
      }

      return new CartPageBinding((LinearLayout) rootView, cart, cartItemsList, cartItemsTitle,
          cartTotalPrice, cartType, cartTypeSpinner, clearCartButton, createCartButton,
          deleteCartButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
