package com.example.ambience_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import com.example.ambience_v2.R

class SocialFeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.social_feed)

        //Fetches the location of friend1
        val friendListLayout = findViewById<LinearLayout>(R.id.friendList)
        val friend1 = friendListLayout.findViewById<TextView>(R.id.friend1)

        //Calls the pop up menu function
        friend1.setOnClickListener { view: View ->
            showPopupMenu(view)
        }

        //Fetches the location of exMess1
        val rightSideMenuLayout = findViewById<LinearLayout>(R.id.rightSideMenu)
        val exMess1 = rightSideMenuLayout.findViewById<TextView>(R.id.exMess1)

        exMess1.setOnClickListener { view: View ->
            showPopupMenu2(view)
        }


        //Fetches the location of ids required
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val menuImageView = findViewById<ImageView>(R.id.menuImageView)
        val backArrow = findViewById<ImageView>(R.id.backArrow)

        //Opens sidebar menu
        menuImageView.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        //Closes sidebar menu
        backArrow.setOnClickListener {
            drawerLayout.closeDrawer(GravityCompat.START)
        }

        //Fetches the location of ids required
        val mailIconImage = findViewById<ImageView>(R.id.mailIconImage)
        val rBackArrow = findViewById<ImageView>(R.id.rBackArrow)

        //Opens sidebar menu
        mailIconImage.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.END)
        }

        //Closes sidebar menu
        rBackArrow.setOnClickListener {
            drawerLayout.closeDrawer(GravityCompat.END)
        }

        //Fetches the location of dailyChallengeTextView
        val dailyChallengeTextView = findViewById<TextView>(R.id.dailyChallengeTextView)

        //When clicked, starts the activity
        dailyChallengeTextView.setOnClickListener {
            val intent = Intent(this, MenuScreenDCActivity::class.java)
            startActivity(intent)
        }

        //Fetches the location of profileTextView
        val profileTextView = findViewById<TextView>(R.id.profileTextView)

        //When clicked, starts the activity
        profileTextView.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    //This function is responsible for handling the pop-up menu
    private fun showPopupMenu(view: View) {
        val inflater = LayoutInflater.from(this)
        val popupView = inflater.inflate(R.layout.f_op_menu, null)

        val popupMenuBuilder = AlertDialog.Builder(this)
        popupMenuBuilder.setView(popupView)
        val popupMenu = popupMenuBuilder.create()
        popupMenu.show()
    }

    private fun showPopupMenu2(view: View) {
        val inflater = LayoutInflater.from(this)
        val popupView = inflater.inflate(R.layout.m_op_menu, null)

        val popupMenuBuilder = AlertDialog.Builder(this)
        popupMenuBuilder.setView(popupView)
        val popupMenu = popupMenuBuilder.create()
        popupMenu.show()
    }
}