package ipt.dam.fragmentosb

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ipt.dam.fragmentosb.fragmentos.Fragmento1
import ipt.dam.fragmentosb.fragmentos.Fragmento2
import ipt.dam.fragmentosb.fragmentos.Fragmento3

class MyViewPagerAdapter(var main: MainActivity) : FragmentStateAdapter(main) {


    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return Fragmento1(main)
            1 -> return Fragmento2()
            2 -> return Fragmento3(main)
            else -> return Fragmento1(main)
        }
    }
}