package com.github.root0616.flysquid;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class FlySquid extends JavaPlugin {

	@Override
	public void onEnable() {
    // Plugin startup logic
    getLogger().info("プラグインが開始しました");
		// 他のクラスから登録する場合
		// コンストラクタで登録する場合
		new RideAnimal(this);
	}

	@Override
	public void onDisable() {
		// 特定のイベントだけを解除する場合
		// 全てのイベントを解除する場合
		HandlerList.unregisterAll(this);
    // Plugin shutdown logic
    getLogger().info("プラグインが停止しました");
	}
}