package com.bing.lan.comm.di;

import com.bing.lan.fm.ui.anchor.AnchorFragment;
import com.bing.lan.fm.ui.category.CategoryFragment;
import com.bing.lan.fm.ui.gank.GankFragment;
import com.bing.lan.fm.ui.girl.GirlFragment;
import com.bing.lan.fm.ui.home.HomeFragment;
import com.bing.lan.fm.ui.hot.HotFragment;
import com.bing.lan.fm.ui.mine.MineFragment;
import com.bing.lan.fm.ui.recommend.RecommendFragment;
import com.bing.lan.fm.ui.splash1.SplashFragment;
import com.bing.lan.fm.ui.subscriber.SubscriberFragment;
import com.bing.lan.fm.ui.top.TopFragment;

import dagger.Component;

@Component(modules = FragmentModule.class)
public interface FragmentComponent {

    void inject(MineFragment mineFragment);

    void inject(HomeFragment homeFragment);

    void inject(HotFragment hotFragment);

    void inject(GankFragment gankFragment);

    void inject(GirlFragment girlFragment);

    void inject(SubscriberFragment subscriberFragment);

    void inject(CategoryFragment categoryFragment);

    void inject(TopFragment topFragment);

    void inject(RecommendFragment recommendFragment);

    void inject(AnchorFragment anchorFragment);

    void inject(SplashFragment splashFragment);
}