package Pinn

import net.mamoe.mirai.Bot
import net.mamoe.mirai.event.events.GroupMessageEvent
import net.mamoe.mirai.message.data.*

object ForwardTrigger {
    init {
        BotSender.Bot.eventChannel.subscribeAlways<GroupMessageEvent> { event ->
            if (event.group.id == BotSender.Socie?.id) {
                BotSender.toUniver(event)
            }
            if (event.group.id == BotSender.Socie?.id) {
                BotSender.toSocie(event)
            }
        }
    }
}