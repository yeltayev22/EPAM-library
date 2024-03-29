package kz.epamlibrary.profile

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*
import kz.epamlibrary.R
import kz.epamlibrary.profile.mylibrary.MyLibraryActivity
import kz.epamlibrary.profile.rentedbooks.RentedBooksActivity
import kz.epamlibrary.profile.wishlist.MyWishListActivity

class ProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        view.myLibrary.setOnClickListener {
            openMyLibrary()
        }
        view.rentedBooks.setOnClickListener {
            openRentedBooks()
        }
        view.wishList.setOnClickListener {
            openMyWishList()
        }

        return view
    }

    private fun openMyLibrary() {
        val intent = Intent(activity, MyLibraryActivity::class.java)
        startActivity(intent)
    }

    private fun openRentedBooks() {
        val intent = Intent(activity, RentedBooksActivity::class.java)
        startActivity(intent)
    }

    private fun openMyWishList() {
        val intent = Intent(activity, MyWishListActivity::class.java)
        startActivity(intent)
    }

    }
