package net.samagames.tools.teamspeak;

/**
* Created by Rigner for project SamaGamesAPI.
*/
public enum ChannelPermission
{
    B_SERVERINSTANCE_HELP_VIEW,
    B_SERVERINSTANCE_VERSION_VIEW,
    B_SERVERINSTANCE_INFO_VIEW,
    B_SERVERINSTANCE_VIRTUALSERVER_LIST,
    B_SERVERINSTANCE_BINDING_LIST,
    B_SERVERINSTANCE_PERMISSION_LIST,
    B_SERVERINSTANCE_PERMISSION_FIND,
    B_VIRTUALSERVER_CREATE,
    B_VIRTUALSERVER_DELETE,
    B_VIRTUALSERVER_START_ANY,
    B_VIRTUALSERVER_STOP_ANY,
    B_VIRTUALSERVER_CHANGE_MACHINE_ID,
    B_VIRTUALSERVER_CHANGE_TEMPLATE,
    B_SERVERQUERY_LOGIN,
    B_SERVERINSTANCE_TEXTMESSAGE_SEND,
    B_SERVERINSTANCE_LOG_VIEW,
    B_SERVERINSTANCE_LOG_ADD,
    B_SERVERINSTANCE_STOP,
    B_SERVERINSTANCE_MODIFY_SETTINGS,
    B_SERVERINSTANCE_MODIFY_QUERYGROUP,
    B_SERVERINSTANCE_MODIFY_TEMPLATES,
    B_VIRTUALSERVER_SELECT,
    B_VIRTUALSERVER_INFO_VIEW,
    B_VIRTUALSERVER_CONNECTIONINFO_VIEW,
    B_VIRTUALSERVER_CHANNEL_LIST,
    B_VIRTUALSERVER_CHANNEL_SEARCH,
    B_VIRTUALSERVER_CLIENT_LIST,
    B_VIRTUALSERVER_CLIENT_SEARCH,
    B_VIRTUALSERVER_CLIENT_DBLIST,
    B_VIRTUALSERVER_CLIENT_DBSEARCH,
    B_VIRTUALSERVER_CLIENT_DBINFO,
    B_VIRTUALSERVER_PERMISSION_FIND,
    B_VIRTUALSERVER_CUSTOM_SEARCH,
    B_VIRTUALSERVER_START,
    B_VIRTUALSERVER_STOP,
    B_VIRTUALSERVER_TOKEN_LIST,
    B_VIRTUALSERVER_TOKEN_ADD,
    B_VIRTUALSERVER_TOKEN_USE,
    B_VIRTUALSERVER_TOKEN_DELETE,
    B_VIRTUALSERVER_LOG_VIEW,
    B_VIRTUALSERVER_LOG_ADD,
    B_VIRTUALSERVER_JOIN_IGNORE_PASSWORD,
    B_VIRTUALSERVER_NOTIFY_REGISTER,
    B_VIRTUALSERVER_NOTIFY_UNREGISTER,
    B_VIRTUALSERVER_SNAPSHOT_CREATE,
    B_VIRTUALSERVER_SNAPSHOT_DEPLOY,
    B_VIRTUALSERVER_PERMISSION_RESET,
    B_VIRTUALSERVER_MODIFY_NAME,
    B_VIRTUALSERVER_MODIFY_WELCOMEMESSAGE,
    B_VIRTUALSERVER_MODIFY_MAXCLIENTS,
    B_VIRTUALSERVER_MODIFY_RESERVED_SLOTS,
    B_VIRTUALSERVER_MODIFY_PASSWORD,
    B_VIRTUALSERVER_MODIFY_DEFAULT_SERVERGROUP,
    B_VIRTUALSERVER_MODIFY_DEFAULT_CHANNELGROUP,
    B_VIRTUALSERVER_MODIFY_DEFAULT_CHANNELADMINGROUP,
    B_VIRTUALSERVER_MODIFY_CHANNEL_FORCED_SILENCE,
    B_VIRTUALSERVER_MODIFY_COMPLAIN,
    B_VIRTUALSERVER_MODIFY_ANTIFLOOD,
    B_VIRTUALSERVER_MODIFY_FT_SETTINGS,
    B_VIRTUALSERVER_MODIFY_FT_QUOTAS,
    B_VIRTUALSERVER_MODIFY_HOSTMESSAGE,
    B_VIRTUALSERVER_MODIFY_HOSTBANNER,
    B_VIRTUALSERVER_MODIFY_HOSTBUTTON,
    B_VIRTUALSERVER_MODIFY_PORT,
    B_VIRTUALSERVER_MODIFY_AUTOSTART,
    B_VIRTUALSERVER_MODIFY_NEEDED_IDENTITY_SECURITY_LEVEL,
    B_VIRTUALSERVER_MODIFY_PRIORITY_SPEAKER_DIMM_MODIFICATOR,
    B_VIRTUALSERVER_MODIFY_LOG_SETTINGS,
    B_VIRTUALSERVER_MODIFY_MIN_CLIENT_VERSION,
    B_VIRTUALSERVER_MODIFY_ICON_ID,
    B_VIRTUALSERVER_MODIFY_WEBLIST,
    B_VIRTUALSERVER_MODIFY_CODEC_ENCRYPTION_MODE,
    B_VIRTUALSERVER_MODIFY_TEMPORARY_PASSWORDS,
    B_VIRTUALSERVER_MODIFY_TEMPORARY_PASSWORDS_OWN,
    I_CHANNEL_MIN_DEPTH,
    I_CHANNEL_MAX_DEPTH,
    B_CHANNEL_GROUP_INHERITANCE_END,
    I_CHANNEL_PERMISSION_MODIFY_POWER,
    I_CHANNEL_NEEDED_PERMISSION_MODIFY_POWER,
    B_CHANNEL_INFO_VIEW,
    B_CHANNEL_CREATE_CHILD,
    B_CHANNEL_CREATE_PERMANENT,
    B_CHANNEL_CREATE_SEMI_PERMANENT,
    B_CHANNEL_CREATE_TEMPORARY,
    B_CHANNEL_CREATE_WITH_TOPIC,
    B_CHANNEL_CREATE_WITH_DESCRIPTION,
    B_CHANNEL_CREATE_WITH_PASSWORD,
    B_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX8,
    B_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX16,
    B_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX32,
    B_CHANNEL_CREATE_MODIFY_WITH_CODEC_CELTMONO48,
    I_CHANNEL_CREATE_MODIFY_WITH_CODEC_MAXQUALITY,
    I_CHANNEL_CREATE_MODIFY_WITH_CODEC_LATENCY_FACTOR_MIN,
    B_CHANNEL_CREATE_WITH_MAXCLIENTS,
    B_CHANNEL_CREATE_WITH_MAXFAMILYCLIENTS,
    B_CHANNEL_CREATE_WITH_SORTORDER,
    B_CHANNEL_CREATE_WITH_DEFAULT,
    B_CHANNEL_CREATE_WITH_NEEDED_TALK_POWER,
    B_CHANNEL_CREATE_MODIFY_WITH_FORCE_PASSWORD,
    B_CHANNEL_MODIFY_PARENT,
    B_CHANNEL_MODIFY_MAKE_DEFAULT,
    B_CHANNEL_MODIFY_MAKE_PERMANENT,
    B_CHANNEL_MODIFY_MAKE_SEMI_PERMANENT,
    B_CHANNEL_MODIFY_MAKE_TEMPORARY,
    B_CHANNEL_MODIFY_NAME,
    B_CHANNEL_MODIFY_TOPIC,
    B_CHANNEL_MODIFY_DESCRIPTION,
    B_CHANNEL_MODIFY_PASSWORD,
    B_CHANNEL_MODIFY_CODEC,
    B_CHANNEL_MODIFY_CODEC_QUALITY,
    B_CHANNEL_MODIFY_CODEC_LATENCY_FACTOR,
    B_CHANNEL_MODIFY_MAXCLIENTS,
    B_CHANNEL_MODIFY_MAXFAMILYCLIENTS,
    B_CHANNEL_MODIFY_SORTORDER,
    B_CHANNEL_MODIFY_NEEDED_TALK_POWER,
    I_CHANNEL_MODIFY_POWER,
    I_CHANNEL_NEEDED_MODIFY_POWER,
    B_CHANNEL_MODIFY_MAKE_CODEC_ENCRYPTED,
    B_CHANNEL_DELETE_PERMANENT,
    B_CHANNEL_DELETE_SEMI_PERMANENT,
    B_CHANNEL_DELETE_TEMPORARY,
    B_CHANNEL_DELETE_FLAG_FORCE,
    I_CHANNEL_DELETE_POWER,
    I_CHANNEL_NEEDED_DELETE_POWER,
    B_CHANNEL_JOIN_PERMANENT,
    B_CHANNEL_JOIN_SEMI_PERMANENT,
    B_CHANNEL_JOIN_TEMPORARY,
    B_CHANNEL_JOIN_IGNORE_PASSWORD,
    B_CHANNEL_JOIN_IGNORE_MAXCLIENTS,
    I_CHANNEL_JOIN_POWER,
    I_CHANNEL_NEEDED_JOIN_POWER,
    I_CHANNEL_SUBSCRIBE_POWER,
    I_CHANNEL_NEEDED_SUBSCRIBE_POWER,
    I_CHANNEL_DESCRIPTION_VIEW_POWER,
    I_CHANNEL_NEEDED_DESCRIPTION_VIEW_POWER,
    I_ICON_ID,
    I_MAX_ICON_FILESIZE,
    B_ICON_MANAGE,
    B_GROUP_IS_PERMANENT,
    I_GROUP_AUTO_UPDATE_TYPE,
    I_GROUP_AUTO_UPDATE_MAX_VALUE,
    I_GROUP_SORT_ID,
    I_GROUP_SHOW_NAME_IN_TREE,
    B_VIRTUALSERVER_SERVERGROUP_LIST,
    B_VIRTUALSERVER_SERVERGROUP_PERMISSION_LIST,
    B_VIRTUALSERVER_SERVERGROUP_CLIENT_LIST,
    B_VIRTUALSERVER_CHANNELGROUP_LIST,
    B_VIRTUALSERVER_CHANNELGROUP_PERMISSION_LIST,
    B_VIRTUALSERVER_CHANNELGROUP_CLIENT_LIST,
    B_VIRTUALSERVER_CLIENT_PERMISSION_LIST,
    B_VIRTUALSERVER_CHANNEL_PERMISSION_LIST,
    B_VIRTUALSERVER_CHANNELCLIENT_PERMISSION_LIST,
    B_VIRTUALSERVER_SERVERGROUP_CREATE,
    B_VIRTUALSERVER_CHANNELGROUP_CREATE,
    I_GROUP_MODIFY_POWER,
    I_GROUP_NEEDED_MODIFY_POWER,
    I_GROUP_MEMBER_ADD_POWER,
    I_GROUP_NEEDED_MEMBER_ADD_POWER,
    I_GROUP_MEMBER_REMOVE_POWER,
    I_GROUP_NEEDED_MEMBER_REMOVE_POWER,
    I_PERMISSION_MODIFY_POWER,
    B_PERMISSION_MODIFY_POWER_IGNORE,
    B_VIRTUALSERVER_SERVERGROUP_DELETE,
    B_VIRTUALSERVER_CHANNELGROUP_DELETE,
    I_CLIENT_PERMISSION_MODIFY_POWER,
    I_CLIENT_NEEDED_PERMISSION_MODIFY_POWER,
    I_CLIENT_MAX_CLONES_UID,
    I_CLIENT_MAX_IDLETIME,
    I_CLIENT_MAX_AVATAR_FILESIZE,
    I_CLIENT_MAX_CHANNEL_SUBSCRIPTIONS,
    B_CLIENT_IS_PRIORITY_SPEAKER,
    B_CLIENT_SKIP_CHANNELGROUP_PERMISSIONS,
    B_CLIENT_FORCE_PUSH_TO_TALK,
    B_CLIENT_IGNORE_BANS,
    B_CLIENT_IGNORE_ANTIFLOOD,
    B_CLIENT_ISSUE_CLIENT_QUERY_COMMAND,
    B_CLIENT_USE_RESERVED_SLOT,
    B_CLIENT_USE_CHANNEL_COMMANDER,
    B_CLIENT_REQUEST_TALKER,
    B_CLIENT_AVATAR_DELETE_OTHER,
    B_CLIENT_IS_STICKY,
    B_CLIENT_IGNORE_STICKY,
    B_CLIENT_INFO_VIEW,
    B_CLIENT_PERMISSIONOVERVIEW_VIEW,
    B_CLIENT_PERMISSIONOVERVIEW_OWN,
    B_CLIENT_REMOTEADDRESS_VIEW,
    I_CLIENT_SERVERQUERY_VIEW_POWER,
    I_CLIENT_NEEDED_SERVERQUERY_VIEW_POWER,
    B_CLIENT_CUSTOM_INFO_VIEW,
    I_CLIENT_KICK_FROM_SERVER_POWER,
    I_CLIENT_NEEDED_KICK_FROM_SERVER_POWER,
    I_CLIENT_KICK_FROM_CHANNEL_POWER,
    I_CLIENT_NEEDED_KICK_FROM_CHANNEL_POWER,
    I_CLIENT_BAN_POWER,
    I_CLIENT_NEEDED_BAN_POWER,
    I_CLIENT_MOVE_POWER,
    I_CLIENT_NEEDED_MOVE_POWER,
    I_CLIENT_COMPLAIN_POWER,
    I_CLIENT_NEEDED_COMPLAIN_POWER,
    B_CLIENT_COMPLAIN_LIST,
    B_CLIENT_COMPLAIN_DELETE_OWN,
    B_CLIENT_COMPLAIN_DELETE,
    B_CLIENT_BAN_LIST,
    B_CLIENT_BAN_CREATE,
    B_CLIENT_BAN_DELETE_OWN,
    B_CLIENT_BAN_DELETE,
    I_CLIENT_BAN_MAX_BANTIME,
    I_CLIENT_PRIVATE_TEXTMESSAGE_POWER,
    I_CLIENT_NEEDED_PRIVATE_TEXTMESSAGE_POWER,
    B_CLIENT_SERVER_TEXTMESSAGE_SEND,
    B_CLIENT_CHANNEL_TEXTMESSAGE_SEND,
    B_CLIENT_OFFLINE_TEXTMESSAGE_SEND,
    I_CLIENT_TALK_POWER,
    I_CLIENT_NEEDED_TALK_POWER,
    I_CLIENT_POKE_POWER,
    I_CLIENT_NEEDED_POKE_POWER,
    B_CLIENT_SET_FLAG_TALKER,
    I_CLIENT_WHISPER_POWER,
    I_CLIENT_NEEDED_WHISPER_POWER,
    B_CLIENT_MODIFY_DESCRIPTION,
    B_CLIENT_MODIFY_OWN_DESCRIPTION,
    B_CLIENT_MODIFY_DBPROPERTIES,
    B_CLIENT_DELETE_DBPROPERTIES,
    B_CLIENT_CREATE_MODIFY_SERVERQUERY_LOGIN,
    B_FT_IGNORE_PASSWORD,
    B_FT_TRANSFER_LIST,
    I_FT_FILE_UPLOAD_POWER,
    I_FT_NEEDED_FILE_UPLOAD_POWER,
    I_FT_FILE_DOWNLOAD_POWER,
    I_FT_NEEDED_FILE_DOWNLOAD_POWER,
    I_FT_FILE_DELETE_POWER,
    I_FT_NEEDED_FILE_DELETE_POWER,
    I_FT_FILE_RENAME_POWER,
    I_FT_NEEDED_FILE_RENAME_POWER,
    I_FT_FILE_BROWSE_POWER,
    I_FT_NEEDED_FILE_BROWSE_POWER,
    I_FT_DIRECTORY_CREATE_POWER,
    I_FT_NEEDED_DIRECTORY_CREATE_POWER,
    I_FT_QUOTA_MB_DOWNLOAD_PER_CLIENT,
    I_FT_QUOTA_MB_UPLOAD_PER_CLIENT,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_HELP_VIEW,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_VERSION_VIEW,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_INFO_VIEW,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_VIRTUALSERVER_LIST,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_BINDING_LIST,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_PERMISSION_LIST,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_PERMISSION_FIND,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CREATE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_DELETE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_START_ANY,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_STOP_ANY,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANGE_MACHINE_ID,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANGE_TEMPLATE,
    I_NEEDED_MODIFY_POWER_SERVERQUERY_LOGIN,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_TEXTMESSAGE_SEND,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_LOG_VIEW,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_LOG_ADD,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_STOP,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_MODIFY_SETTINGS,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_MODIFY_QUERYGROUP,
    I_NEEDED_MODIFY_POWER_SERVERINSTANCE_MODIFY_TEMPLATES,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_SELECT,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_INFO_VIEW,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CONNECTIONINFO_VIEW,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANNEL_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANNEL_SEARCH,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CLIENT_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CLIENT_SEARCH,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CLIENT_DBLIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CLIENT_DBSEARCH,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CLIENT_DBINFO,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_PERMISSION_FIND,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CUSTOM_SEARCH,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_START,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_STOP,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_TOKEN_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_TOKEN_ADD,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_TOKEN_USE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_TOKEN_DELETE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_LOG_VIEW,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_LOG_ADD,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_JOIN_IGNORE_PASSWORD,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_NOTIFY_REGISTER,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_NOTIFY_UNREGISTER,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_SNAPSHOT_CREATE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_SNAPSHOT_DEPLOY,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_PERMISSION_RESET,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_NAME,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_WELCOMEMESSAGE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_MAXCLIENTS,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_RESERVED_SLOTS,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_PASSWORD,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_DEFAULT_SERVERGROUP,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_DEFAULT_CHANNELGROUP,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_DEFAULT_CHANNELADMINGROUP,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_CHANNEL_FORCED_SILENCE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_COMPLAIN,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_ANTIFLOOD,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_FT_SETTINGS,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_FT_QUOTAS,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_HOSTMESSAGE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_HOSTBANNER,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_HOSTBUTTON,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_PORT,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_AUTOSTART,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_NEEDED_IDENTITY_SECURITY_LEVEL,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_PRIORITY_SPEAKER_DIMM_MODIFICATOR,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_LOG_SETTINGS,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_MIN_CLIENT_VERSION,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_ICON_ID,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_WEBLIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_CODEC_ENCRYPTION_MODE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_TEMPORARY_PASSWORDS,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_MODIFY_TEMPORARY_PASSWORDS_OWN,
    I_NEEDED_MODIFY_POWER_CHANNEL_MIN_DEPTH,
    I_NEEDED_MODIFY_POWER_CHANNEL_MAX_DEPTH,
    I_NEEDED_MODIFY_POWER_CHANNEL_GROUP_INHERITANCE_END,
    I_NEEDED_MODIFY_POWER_CHANNEL_PERMISSION_MODIFY_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_NEEDED_PERMISSION_MODIFY_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_INFO_VIEW,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_CHILD,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_PERMANENT,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_SEMI_PERMANENT,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_TEMPORARY,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_WITH_TOPIC,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_WITH_DESCRIPTION,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_WITH_PASSWORD,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX8,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX16,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_MODIFY_WITH_CODEC_SPEEX32,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_MODIFY_WITH_CODEC_CELTMONO48,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_MODIFY_WITH_CODEC_MAXQUALITY,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_MODIFY_WITH_CODEC_LATENCY_FACTOR_MIN,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_WITH_MAXCLIENTS,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_WITH_MAXFAMILYCLIENTS,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_WITH_SORTORDER,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_WITH_DEFAULT,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_WITH_NEEDED_TALK_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_CREATE_MODIFY_WITH_FORCE_PASSWORD,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_PARENT,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_MAKE_DEFAULT,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_MAKE_PERMANENT,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_MAKE_SEMI_PERMANENT,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_MAKE_TEMPORARY,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_NAME,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_TOPIC,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_DESCRIPTION,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_PASSWORD,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_CODEC,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_CODEC_QUALITY,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_CODEC_LATENCY_FACTOR,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_MAXCLIENTS,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_MAXFAMILYCLIENTS,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_SORTORDER,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_NEEDED_TALK_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_NEEDED_MODIFY_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_MODIFY_MAKE_CODEC_ENCRYPTED,
    I_NEEDED_MODIFY_POWER_CHANNEL_DELETE_PERMANENT,
    I_NEEDED_MODIFY_POWER_CHANNEL_DELETE_SEMI_PERMANENT,
    I_NEEDED_MODIFY_POWER_CHANNEL_DELETE_TEMPORARY,
    I_NEEDED_MODIFY_POWER_CHANNEL_DELETE_FLAG_FORCE,
    I_NEEDED_MODIFY_POWER_CHANNEL_DELETE_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_NEEDED_DELETE_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_JOIN_PERMANENT,
    I_NEEDED_MODIFY_POWER_CHANNEL_JOIN_SEMI_PERMANENT,
    I_NEEDED_MODIFY_POWER_CHANNEL_JOIN_TEMPORARY,
    I_NEEDED_MODIFY_POWER_CHANNEL_JOIN_IGNORE_PASSWORD,
    I_NEEDED_MODIFY_POWER_CHANNEL_JOIN_IGNORE_MAXCLIENTS,
    I_NEEDED_MODIFY_POWER_CHANNEL_JOIN_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_NEEDED_JOIN_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_SUBSCRIBE_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_NEEDED_SUBSCRIBE_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_DESCRIPTION_VIEW_POWER,
    I_NEEDED_MODIFY_POWER_CHANNEL_NEEDED_DESCRIPTION_VIEW_POWER,
    I_NEEDED_MODIFY_POWER_ICON_ID,
    I_NEEDED_MODIFY_POWER_MAX_ICON_FILESIZE,
    I_NEEDED_MODIFY_POWER_ICON_MANAGE,
    I_NEEDED_MODIFY_POWER_GROUP_IS_PERMANENT,
    I_NEEDED_MODIFY_POWER_GROUP_AUTO_UPDATE_TYPE,
    I_NEEDED_MODIFY_POWER_GROUP_AUTO_UPDATE_MAX_VALUE,
    I_NEEDED_MODIFY_POWER_GROUP_SORT_ID,
    I_NEEDED_MODIFY_POWER_GROUP_SHOW_NAME_IN_TREE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_SERVERGROUP_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_SERVERGROUP_PERMISSION_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_SERVERGROUP_CLIENT_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANNELGROUP_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANNELGROUP_PERMISSION_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANNELGROUP_CLIENT_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CLIENT_PERMISSION_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANNEL_PERMISSION_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANNELCLIENT_PERMISSION_LIST,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_SERVERGROUP_CREATE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANNELGROUP_CREATE,
    I_NEEDED_MODIFY_POWER_GROUP_MODIFY_POWER,
    I_NEEDED_MODIFY_POWER_GROUP_NEEDED_MODIFY_POWER,
    I_NEEDED_MODIFY_POWER_GROUP_MEMBER_ADD_POWER,
    I_NEEDED_MODIFY_POWER_GROUP_NEEDED_MEMBER_ADD_POWER,
    I_NEEDED_MODIFY_POWER_GROUP_MEMBER_REMOVE_POWER,
    I_NEEDED_MODIFY_POWER_GROUP_NEEDED_MEMBER_REMOVE_POWER,
    I_NEEDED_MODIFY_POWER_PERMISSION_MODIFY_POWER,
    I_NEEDED_MODIFY_POWER_PERMISSION_MODIFY_POWER_IGNORE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_SERVERGROUP_DELETE,
    I_NEEDED_MODIFY_POWER_VIRTUALSERVER_CHANNELGROUP_DELETE,
    I_NEEDED_MODIFY_POWER_CLIENT_PERMISSION_MODIFY_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_PERMISSION_MODIFY_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_MAX_CLONES_UID,
    I_NEEDED_MODIFY_POWER_CLIENT_MAX_IDLETIME,
    I_NEEDED_MODIFY_POWER_CLIENT_MAX_AVATAR_FILESIZE,
    I_NEEDED_MODIFY_POWER_CLIENT_MAX_CHANNEL_SUBSCRIPTIONS,
    I_NEEDED_MODIFY_POWER_CLIENT_IS_PRIORITY_SPEAKER,
    I_NEEDED_MODIFY_POWER_CLIENT_SKIP_CHANNELGROUP_PERMISSIONS,
    I_NEEDED_MODIFY_POWER_CLIENT_FORCE_PUSH_TO_TALK,
    I_NEEDED_MODIFY_POWER_CLIENT_IGNORE_BANS,
    I_NEEDED_MODIFY_POWER_CLIENT_IGNORE_ANTIFLOOD,
    I_NEEDED_MODIFY_POWER_CLIENT_ISSUE_CLIENT_QUERY_COMMAND,
    I_NEEDED_MODIFY_POWER_CLIENT_USE_RESERVED_SLOT,
    I_NEEDED_MODIFY_POWER_CLIENT_USE_CHANNEL_COMMANDER,
    I_NEEDED_MODIFY_POWER_CLIENT_REQUEST_TALKER,
    I_NEEDED_MODIFY_POWER_CLIENT_AVATAR_DELETE_OTHER,
    I_NEEDED_MODIFY_POWER_CLIENT_IS_STICKY,
    I_NEEDED_MODIFY_POWER_CLIENT_IGNORE_STICKY,
    I_NEEDED_MODIFY_POWER_CLIENT_INFO_VIEW,
    I_NEEDED_MODIFY_POWER_CLIENT_PERMISSIONOVERVIEW_VIEW,
    I_NEEDED_MODIFY_POWER_CLIENT_PERMISSIONOVERVIEW_OWN,
    I_NEEDED_MODIFY_POWER_CLIENT_REMOTEADDRESS_VIEW,
    I_NEEDED_MODIFY_POWER_CLIENT_SERVERQUERY_VIEW_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_SERVERQUERY_VIEW_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_CUSTOM_INFO_VIEW,
    I_NEEDED_MODIFY_POWER_CLIENT_KICK_FROM_SERVER_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_KICK_FROM_SERVER_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_KICK_FROM_CHANNEL_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_KICK_FROM_CHANNEL_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_BAN_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_BAN_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_MOVE_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_MOVE_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_COMPLAIN_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_COMPLAIN_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_COMPLAIN_LIST,
    I_NEEDED_MODIFY_POWER_CLIENT_COMPLAIN_DELETE_OWN,
    I_NEEDED_MODIFY_POWER_CLIENT_COMPLAIN_DELETE,
    I_NEEDED_MODIFY_POWER_CLIENT_BAN_LIST,
    I_NEEDED_MODIFY_POWER_CLIENT_BAN_CREATE,
    I_NEEDED_MODIFY_POWER_CLIENT_BAN_DELETE_OWN,
    I_NEEDED_MODIFY_POWER_CLIENT_BAN_DELETE,
    I_NEEDED_MODIFY_POWER_CLIENT_BAN_MAX_BANTIME,
    I_NEEDED_MODIFY_POWER_CLIENT_PRIVATE_TEXTMESSAGE_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_PRIVATE_TEXTMESSAGE_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_SERVER_TEXTMESSAGE_SEND,
    I_NEEDED_MODIFY_POWER_CLIENT_CHANNEL_TEXTMESSAGE_SEND,
    I_NEEDED_MODIFY_POWER_CLIENT_OFFLINE_TEXTMESSAGE_SEND,
    I_NEEDED_MODIFY_POWER_CLIENT_TALK_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_TALK_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_POKE_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_POKE_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_SET_FLAG_TALKER,
    I_NEEDED_MODIFY_POWER_CLIENT_WHISPER_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_NEEDED_WHISPER_POWER,
    I_NEEDED_MODIFY_POWER_CLIENT_MODIFY_DESCRIPTION,
    I_NEEDED_MODIFY_POWER_CLIENT_MODIFY_OWN_DESCRIPTION,
    I_NEEDED_MODIFY_POWER_CLIENT_MODIFY_DBPROPERTIES,
    I_NEEDED_MODIFY_POWER_CLIENT_DELETE_DBPROPERTIES,
    I_NEEDED_MODIFY_POWER_CLIENT_CREATE_MODIFY_SERVERQUERY_LOGIN,
    I_NEEDED_MODIFY_POWER_FT_IGNORE_PASSWORD,
    I_NEEDED_MODIFY_POWER_FT_TRANSFER_LIST,
    I_NEEDED_MODIFY_POWER_FT_FILE_UPLOAD_POWER,
    I_NEEDED_MODIFY_POWER_FT_NEEDED_FILE_UPLOAD_POWER,
    I_NEEDED_MODIFY_POWER_FT_FILE_DOWNLOAD_POWER,
    I_NEEDED_MODIFY_POWER_FT_NEEDED_FILE_DOWNLOAD_POWER,
    I_NEEDED_MODIFY_POWER_FT_FILE_DELETE_POWER,
    I_NEEDED_MODIFY_POWER_FT_NEEDED_FILE_DELETE_POWER,
    I_NEEDED_MODIFY_POWER_FT_FILE_RENAME_POWER,
    I_NEEDED_MODIFY_POWER_FT_NEEDED_FILE_RENAME_POWER,
    I_NEEDED_MODIFY_POWER_FT_FILE_BROWSE_POWER,
    I_NEEDED_MODIFY_POWER_FT_NEEDED_FILE_BROWSE_POWER,
    I_NEEDED_MODIFY_POWER_FT_DIRECTORY_CREATE_POWER,
    I_NEEDED_MODIFY_POWER_FT_NEEDED_DIRECTORY_CREATE_POWER,
    I_NEEDED_MODIFY_POWER_FT_QUOTA_MB_DOWNLOAD_PER_CLIENT,
    I_NEEDED_MODIFY_POWER_FT_QUOTA_MB_UPLOAD_PER_CLIENT
}
