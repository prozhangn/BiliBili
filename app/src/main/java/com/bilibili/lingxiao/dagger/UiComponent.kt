package com.bilibili.lingxiao.dagger

import com.bilibili.lingxiao.MainActivity
import com.bilibili.lingxiao.home.category.ui.CategoryFragment
import com.bilibili.lingxiao.home.live.ui.LiveFragment
import com.bilibili.lingxiao.home.mikan.ui.MikanFragment
import com.bilibili.lingxiao.home.recommend.ui.RecommendFragment
import com.bilibili.lingxiao.dagger.scope.PerUi
import com.bilibili.lingxiao.home.live.ui.play.FansFragment
import com.bilibili.lingxiao.home.live.ui.play.FleetListFragment
import com.bilibili.lingxiao.home.live.ui.play.InteractFragment
import com.bilibili.lingxiao.home.live.ui.play.UpInfoFragment
import com.bilibili.lingxiao.home.live.ui.LivePlayActivity
import com.bilibili.lingxiao.play.ui.CommentFragment
import com.bilibili.lingxiao.play.ui.IntroduceFragment
import com.bilibili.lingxiao.play.ui.PlayActivity
import dagger.Component

@Component(modules = [UiModule::class])
@PerUi
interface UiComponent {
    fun inject(liveFragment: LiveFragment)
    fun inject(recommendFragment: RecommendFragment)
    fun inject(hotFragment: CategoryFragment)
    fun inject(mikanFragment: MikanFragment)
    fun inject(introduceFragment: IntroduceFragment)
    fun inject(commentFragment: CommentFragment)

    fun inject(interactFragment: InteractFragment)
    fun inject(upInfoFragment: UpInfoFragment)
    fun inject(fansFragment: FansFragment)
    fun inject(fleetListFragment: FleetListFragment)

    fun inject(mainActivity: MainActivity)
    fun inject(playActivity: PlayActivity)
    fun inject(livePlayActivity: LivePlayActivity)
}