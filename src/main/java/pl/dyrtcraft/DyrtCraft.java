package pl.dyrtcraft;

import javax.annotation.Nonnull;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import pl.dyrtcraft.xp.DyrtBungeeCord;
import pl.dyrtcraft.xp.DyrtDatabase;
import pl.dyrtcraft.xp.DyrtKits;
import pl.dyrtcraft.xp.DyrtMember;
import pl.dyrtcraft.xp.DyrtUtils;

public final class DyrtCraft {
	
	private static Player memName;
	private static BungeeCord bungeeCord = new DyrtBungeeCord();
	private static Member member = new DyrtMember(memName);
	private static Database database = new DyrtDatabase();
	private static Kits kits = new DyrtKits();
	private static Util util = new DyrtUtils();
	
	public static Database getDatabase() {
		return database;
	}
	
	public static Kits getKits() {
		return kits;
	}
	
	public static Member getMember(@Nonnull Player player) {
		memName = player;
		return member;
	}
	
	public static Member getMember(@Nonnull String name) {
		Player player = Bukkit.getPlayer(name);
		memName = player;
		return member;
	}
	
	public static BungeeCord getProxy() {
		return bungeeCord;
	}
	
	public static Util getUtils() {
		return util;
	}
	
}