/*
 *  Android Weather Notification.
 *  Copyright (C) 2010  Denis Nelubin aka Gelin
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *  http://gelin.ru
 *  mailto:den@gelin.ru
 */

package ru.gelin.android.weather.notification.skin.blacktextplus;

import ru.gelin.android.weather.notification.skin.TemperatureUnit;
import android.content.Context;
import android.widget.RemoteViews;

/**
 *  Utility to layout weather values to remove view.
 */
public class RemoteWeatherLayout extends ru.gelin.android.weather.notification.skin.builtin.RemoteWeatherLayout {
    
    /**
     *  Creates the utility for specified context.
     */
    public RemoteWeatherLayout(Context context, RemoteViews views) {
        super(context, views);
    }
    
    protected String formatTemp(int temp) {
        return TempFormatter.formatTemp(temp);
    }
    
    protected String formatTemp(int temp, TemperatureUnit unit) {
        return TempFormatter.formatTemp(temp, unit);
    }
    
    protected String formatTemp(int tempC, int tempF, TemperatureUnit unit) {
        return TempFormatter.formatTemp(tempC, tempF, unit);
    }

}
